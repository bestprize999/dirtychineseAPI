package com.fengxingshifang.dirtychinese.dao;

import com.fengxingshifang.dirtychinese.entity.User;
import com.fengxingshifang.dirtychinese.entity.UserExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);
    
    int save(User record);


    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
    
    User findByUserId(@Param("userId") String userId);
}