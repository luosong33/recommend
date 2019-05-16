package cn.ls.service;

import cn.ls.entity.RealTimeRules;

import java.util.List;

/**
 * Created by asong on 2019/5/15.
 */
public interface RealTimeRulesService {

    void add(RealTimeRules realTimeRules);
    void delete(String id);
    void update(RealTimeRules realTimeRules);
    List<RealTimeRules> selectList();
    RealTimeRules selectOne(String id);


}
