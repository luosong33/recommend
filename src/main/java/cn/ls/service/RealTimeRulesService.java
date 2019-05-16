package cn.ls.service;

import cn.ls.entity.RealTimeRules;

import java.util.List;

/**
 * Created by asong on 2019/5/15.
 */
public interface RealTimeRulesService {

    Integer add(RealTimeRules realTimeRules);
    void delete(Integer id);
    Integer update(RealTimeRules realTimeRules);
    List<RealTimeRules> selectList();
    RealTimeRules selectOne(Integer id);


}
