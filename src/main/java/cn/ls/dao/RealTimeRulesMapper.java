package cn.ls.dao;

import cn.ls.entity.RealTimeRules;

import java.util.List;

public interface RealTimeRulesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RealTimeRules record);

    int insertSelective(RealTimeRules record);

    RealTimeRules selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RealTimeRules record);

    int updateByPrimaryKey(RealTimeRules record);

    List<RealTimeRules> selectList();
}