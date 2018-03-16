package com.tsy.mqconsumer.dao.mapper;

import com.tsy.mqconsumer.model.Table0130;
import com.tsy.mqconsumer.model.Table0130Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Table0130Mapper {
    long countByExample(Table0130Example example);

    int deleteByExample(Table0130Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Table0130 record);

    int insertSelective(Table0130 record);

    List<Table0130> selectByExample(Table0130Example example);

    Table0130 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Table0130 record, @Param("example") Table0130Example example);

    int updateByExample(@Param("record") Table0130 record, @Param("example") Table0130Example example);

    int updateByPrimaryKeySelective(Table0130 record);

    int updateByPrimaryKey(Table0130 record);
}