package cn.ls.service;

import cn.ls.dao.RealTimeRulesMapper;
import cn.ls.entity.RealTimeRules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by asong on 2019/5/15.
 */
@Service
public class RealTimeRulesServiceImpl implements RealTimeRulesService {

    @Autowired
    private RealTimeRulesMapper realTimeRulesMapper;

    @Override
    public Integer add(RealTimeRules realTimeRules) {
        return realTimeRulesMapper.insert(realTimeRules);
    }

    @Override
    public void delete(Integer id) {
        realTimeRulesMapper.deleteByPrimaryKey(1);
    }

    @Override
    public Integer update(RealTimeRules realTimeRules) {
        return realTimeRulesMapper.updateByPrimaryKeySelective(realTimeRules);
    }

//    @Override
    public List<RealTimeRules> selectList() {
        List<RealTimeRules> list = realTimeRulesMapper.selectList();
        return list;
    }

    @Override
    public RealTimeRules selectOne(Integer id) {
        RealTimeRules realTimeRules = realTimeRulesMapper.selectByPrimaryKey(id);
        return realTimeRules;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        RealTimeRulesService service = ctx.getBean(RealTimeRulesService.class);
//        List<RealTimeRules> list = service.selectList();
//        RealTimeRules selectOne = service.selectOne(1);
//        service.delete(1);
        RealTimeRules realTimeRules = new RealTimeRules();
        realTimeRules.setPreference("10");
        realTimeRules.setInterested("3");
        realTimeRules.setMay_interested("1");
        realTimeRules.setCreated(new Date());
        realTimeRules.setUpdated(new Date());
//        Integer add = service.add(realTimeRules);
        realTimeRules.setId(3);
        Integer update = service.update(realTimeRules);
    }
}
