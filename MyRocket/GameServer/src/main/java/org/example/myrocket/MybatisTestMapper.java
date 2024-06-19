package org.example.myrocket;

import org.apache.ibatis.annotations.Mapper;
import org.example.myrocket.mysql.Blog;

@Mapper
public interface MybatisTestMapper {
    Blog queryById(int id);
}
