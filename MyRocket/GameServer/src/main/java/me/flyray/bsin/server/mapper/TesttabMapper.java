package me.flyray.bsin.server.mapper;

import me.flyray.bsin.server.domain.Testtab;

public interface TesttabMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Testtab record);

    int insertSelective(Testtab record);

    Testtab selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Testtab record);

    int updateByPrimaryKey(Testtab record);
}