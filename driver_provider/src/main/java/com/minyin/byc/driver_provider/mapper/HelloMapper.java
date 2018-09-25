package com.minyin.byc.driver_provider.mapper;


import com.minyin.byc.driver_provider.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HelloMapper {

    @Select("select user_id,name,sex from user where user_id = #{user_id}")
    User selectById(Integer user_id);

}
