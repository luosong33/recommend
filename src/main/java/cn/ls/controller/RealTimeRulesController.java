package cn.ls.controller;

import cn.ls.entity.RealTimeRules;
import cn.ls.service.RealTimeRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2019/5/14.
 *
 */
@Controller
@RequestMapping("/real")
public class RealTimeRulesController {

    @Autowired
    private RealTimeRulesService realTimeRulesService;

    @RequestMapping(value = "/one",method = RequestMethod.GET)
    public String one(){
        RealTimeRules one = realTimeRulesService.selectOne("1");
        return "Hello Controller";
    }

    /**
     * list
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    /**
     * 注册页面
     * @return
     */
    @RequestMapping(value = "/register.do",method = RequestMethod.GET)
    public String register(){
        return "login";
    }


}
