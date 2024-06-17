package org.example.myrocket;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MybatisTestMapper {
    Blog queryById(int id);
}
