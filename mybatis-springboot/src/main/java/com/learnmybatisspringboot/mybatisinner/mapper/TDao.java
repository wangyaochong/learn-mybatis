package com.learnmybatisspringboot.mybatisinner.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

//@Mapper
public interface TDao {
    @Select("select * from t_order")
    List<Map<String,Object>> list();
}
