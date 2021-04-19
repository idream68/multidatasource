package com.study.mysql.multisource.mapper;

import com.study.mysql.multisource.config.mysql.MyDataSource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PrimaryMapper {
    @MyDataSource(dataSource = "primary")
    @Select("select count(1) from primary")
    int getCount();
}
