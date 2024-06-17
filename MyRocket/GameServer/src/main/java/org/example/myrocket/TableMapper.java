package org.example.myrocket;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TableMapper {
    void createTable(String name);
}
