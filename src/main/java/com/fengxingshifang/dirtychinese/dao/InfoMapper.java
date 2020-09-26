package com.fengxingshifang.dirtychinese.dao;

import com.fengxingshifang.dirtychinese.entity.Info;
import com.fengxingshifang.dirtychinese.entity.InfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InfoMapper {
    long countByExample(InfoExample example);

    int deleteByExample(InfoExample example);

    int insert(Info record);

    int insertSelective(Info record);

    List<Info> selectAll();
    
    List<Info> selectByExample(InfoExample example);

    int updateByExampleSelective(@Param("record") Info record, @Param("example") InfoExample example);

    int updateByExample(@Param("record") Info record, @Param("example") InfoExample example);
    
    List<Info> getInfolistHome(int count);
    List<Info> getInfolistMypublish(@Param("userid") String userid, @Param("count") int count);
    List<Info> getInfolistMycollect(@Param("userid") String userid, @Param("count") int count);
    List<Info> getInfolistMycomment(@Param("userid") String userid, @Param("count") int count);
    List<Info> getInfolistMyview(@Param("userid") String userid, @Param("count") int count);
    List<Info> getInfo(String infoid);
    List<Info> getInfoComment(@Param("infoid") String userid, @Param("count") int count);
    void newInfo(Info info);
    void addInfo(Info info);
    void addComment(Info info, String userid);
    void addColl(Info info, String userid);

}