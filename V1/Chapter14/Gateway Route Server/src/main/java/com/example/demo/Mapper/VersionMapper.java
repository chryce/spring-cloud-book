package com.example.demo.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface VersionMapper {

    @Select("select max(id) from version")
    Long getLastVersion();

}