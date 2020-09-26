package com.fengxingshifang.dirtychinese.dao;

import com.fengxingshifang.dirtychinese.entity.Inforela;
import com.fengxingshifang.dirtychinese.entity.InforelaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InforelaMapper {
    long countByExample(InforelaExample example);

    int deleteByExample(InforelaExample example);

    int insert(Inforela record);

    int insertSelective(Inforela record);

    List<Inforela> selectByExample(InforelaExample example);

    int updateByExampleSelective(@Param("record") Inforela record, @Param("example") InforelaExample example);

    int updateByExample(@Param("record") Inforela record, @Param("example") InforelaExample example);
}