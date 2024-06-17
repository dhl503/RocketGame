package org.example.myrocket;

import cfg.Tables;
import com.google.gson.JsonParser;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;


@Component
@Slf4j
public class GameServer {

    // JDBC 驱动名称以及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://192.168.46.128:3306/Pomelo";

    // 数据库的用户名与密码
    static final String USER = "liudl01";
    static final String PASS = "hello1987";

    /**
     * @throws IOException
     */
    public void LoadConfigs() throws IOException {

        String configPath = ResourceUtils.getFile("classpath:GenerateJsons").getPath();

        Tables tables = new Tables(file -> JsonParser.parseString(
                new String(Files.readAllBytes(Paths.get(configPath, file + ".json")), "UTF-8")));
        cfg.Item ss = tables.getTbItem().get(10000);
        System.out.println(ss.desc);
    }

    public void ConnectMysql() throws SQLException {

        //Driver driver = new Driver();//创建driver对象
        //String url = "jdbc:mysql://localhost:3306/data";
        ////将用户和密码放入到Properties对象
        //Properties properties = new Properties();
        //properties.setProperty("user","liudl01");//用户
        //properties.setProperty("password","hello1987");//密码
        //Connection connect = driver.connect(url, properties);//得到连接


        Connection conn = null;
        Statement stmt = null;
        try {
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);

            // 打开连接
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // 执行查询
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT id, name, age FROM your_table_name";
            ResultSet rs = stmt.executeQuery(sql);

            // 处理结果集
            while (rs.next()) {
                // 通过字段检索
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                // 输出数据
                System.out.print("ID: " + id);
                System.out.print(", Name: " + name);
                System.out.println(", Age: " + age);
            }
            // 关闭资源
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // 处理 JDBC 错误
            se.printStackTrace();
        } catch (Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");

    }

    /**
     *
     */
    public void Start() {
        //创建两个线程组 boosGroup、workerGroup
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            //创建服务端的启动对象，设置参数
            ServerBootstrap bootstrap = new ServerBootstrap();
            //设置两个线程组boosGroup和workerGroup
            bootstrap.group(bossGroup, workerGroup)
                    //设置服务端通道实现类型
                    .channel(NioServerSocketChannel.class)
                    //设置线程队列得到连接个数
                    .option(ChannelOption.SO_BACKLOG, 128)
                    //设置保持活动连接状态
                    .childOption(ChannelOption.SO_KEEPALIVE, true)
                    //使用匿名内部类的形式初始化通道对象
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            //给pipeline管道设置处理器
                            socketChannel.pipeline().addLast(new MyServerHandler());
                        }
                    });//给workerGroup的EventLoop对应的管道设置处理器
            System.out.println("java技术爱好者的服务端已经准备就绪...");
            //绑定端口号，启动服务端
            ChannelFuture channelFuture = bootstrap.bind(6666).sync();
            //对关闭通道进行监听
            channelFuture.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }

    }

    public static void main(String[] args) throws IOException {
        Path nnn = Paths.get("GenerateJsons", "item_tbitem" + ".json");

        //String path = getClassLoader().getResource("").getPath();//注意getResource("")里面是空字符串
        //System.out.println(path);

        Resource[] resources = ResourcePatternUtils
                .getResourcePatternResolver(null)
                .getResources("classpath:" + "GenerateJsons/" + "*.json");

        Resource[] sskkk = ResourcePatternUtils
                .getResourcePatternResolver(null)
                .getResources("classpath:" + "GenerateJsons/");
        String nini = sskkk[0].getFile().getPath();

        String nsds = ResourcePatternUtils.getResourcePatternResolver(null).getResource("").getFilename();

        String hel = ResourceUtils.getFile("classpath:GenerateJsons").getPath();
        String hel2 = ResourceUtils.getFile("GenerateJsons").getPath();

        String sk = GameServer.class.getClassLoader().getResource("").getPath();

        //String niinss = Files.readAllBytes(Paths.get(nini, file + ".json"));


        Tables tables = new Tables(file -> JsonParser.parseString(new String(Files.readAllBytes(Paths.get(nini, file + ".json")), "UTF-8")));
        cfg.Item ss = tables.getTbItem().get(10000);
        System.out.println(112);
        //new String(Files.readAllBytes(Paths.get("C:\\JavaTest\\MyRocket\\src\\main\\resources\\GenerateJsons", file + ".json")), "UTF-8")));
    }
}
