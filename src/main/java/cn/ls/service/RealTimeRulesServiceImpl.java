package cn.ls.service;

import cn.ls.dao.RealTimeRulesMapper;
import cn.ls.entity.RealTimeRules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by asong on 2019/5/15.
 */
@Service
public class RealTimeRulesServiceImpl implements RealTimeRulesService {

    @Autowired
    private RealTimeRulesMapper realTimeRulesMapper;

    @Override
    public void add(RealTimeRules realTimeRules) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(RealTimeRules realTimeRules) {

    }

//    @Override
    public List<RealTimeRules> selectList() {
        List<RealTimeRules> list = realTimeRulesMapper.selectList();
        return list;
    }

    @Override
    public RealTimeRules selectOne(String id) {
        RealTimeRules realTimeRules = realTimeRulesMapper.selectByPrimaryKey(id);
        return realTimeRules;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        RealTimeRulesService service = ctx.getBean(RealTimeRulesService.class);
        List<RealTimeRules> list = service.selectList();
//        RealTimeRules selectOne = service.selectOne("1");
    }
}
