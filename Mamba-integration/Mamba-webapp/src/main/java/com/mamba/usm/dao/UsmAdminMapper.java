package com.mamba.usm.dao;

import com.mamba.usm.entity.UsmAdmin;
import com.mamba.usm.entity.UsmAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsmAdminMapper {
    int countByExample(UsmAdminExample example);

    int deleteByExample(UsmAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsmAdmin record);

    int insertSelective(UsmAdmin record);

    List<UsmAdmin> selectByExample(UsmAdminExample example);

    UsmAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UsmAdmin record, @Param("example") UsmAdminExample example);

    int updateByExample(@Param("record") UsmAdmin record, @Param("example") UsmAdminExample example);

    int updateByPrimaryKeySelective(UsmAdmin record);

    int updateByPrimaryKey(UsmAdmin record);
}