package org.example.myrocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class ConnectJDBCTemplate {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void TestSql() {

        findAll();
        if (true) return;


        //String sql = "select * from User";
        //List<Map<String, Object>> list1 = jdbcTemplate.queryForList(sql);

        //String sql2 = "select name form User";
        //jdbcTemplate.query(sql2, Data2Struct);

        String sql3 = "select * from User";

        jdbcTemplate.queryForObject(sql3,
                new RowMapper<MyUser>() {
                    public MyUser mapRow(ResultSet rs, int rowNum)
                            throws SQLException {
                        String di = rs.getString("id");
                        String r11 = rs.getString("name");

                        MyUser s = new MyUser();
                        return s;
                    }
                    ;
                });

        System.out.println(1);
    }

    public Iterable<MyUser> findAll() {
        return jdbcTemplate.query("select * from User", this::Data2Struct);
    }


    private MyUser Data2Struct(ResultSet rs, int rowNum)
            throws SQLException {

        String di = rs.getString("id");
        String r11 = rs.getString("name");

        log.info("id:{} name:{}", di, r11);
        log.info("id:{} name:{}" + di + r11);

        MyUser ss = new MyUser();
        return ss;
    }
}
