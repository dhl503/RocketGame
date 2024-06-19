# RocketGame

##### 简介
尝试基于Spring建一个后端的框架，包含最基本的一些组件。

- 开发标准：Java17
- 数据库：支持mysql，redis
- 策划配置：集成luban工具
- 网络：对外采用grpc，服务器之间采用dubbo
- orm：支持 spring data jdbc，mybatis
- 注册中心：nacos

##### 安装步骤

- 进入MyRocketTools，执行nacos_start.bat打开nacos
- 进入Sql文件夹，并导入sql数据

##### 能干什么
主要目的是为了能够快速开发一个游戏服务器的逻辑，而不需要再重新搭建框架。
也是用于自己学习的目的，锻炼自己架构项目的能力。同时也能够给其他想搭建游戏
服务器的同学提供些许帮助。

##### 关键点讲解

###### 如何使用Spring Data JDBC来进行数据表的存取

1.创建需要操作的pojo类
2.创建与类对应的数据库表
3.继承CrudRepository接口
4.装在第三部的接口，操纵数据库
