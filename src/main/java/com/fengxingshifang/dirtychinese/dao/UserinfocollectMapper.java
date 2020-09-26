package com.fengxingshifang.dirtychinese.dao;

import com.fengxingshifang.dirtychinese.entity.Userinfocollect;
import com.fengxingshifang.dirtychinese.entity.UserinfocollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinfocollectMapper {
    long countByExample(UserinfocollectExample example);

    int deleteByExample(UserinfocollectExample example);

    int insert(Userinfocollect record);

    int insertSelective(Userinfocollect record);

    List<Userinfocollect> selectByExample(UserinfocollectExample example);

    int updateByExampleSelective(@Param("record") Userinfocollect record, @Param("example") UserinfocollectExample example);

    int updateByExample(@Param("record") Userinfocollect record, @Param("example") UserinfocollectExample example);
}