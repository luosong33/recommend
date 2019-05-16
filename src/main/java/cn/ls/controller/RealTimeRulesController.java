package cn.ls.controller;

import cn.ls.entity.RealTimeRules;
import cn.ls.service.RealTimeRulesService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

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
        RealTimeRules one = realTimeRulesService.selectOne(1);
        return "one";
    }

    /**
     * list
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(){
        List<RealTimeRules> list = realTimeRulesService.selectList();
        return "list";
    }

    /**
     * delete
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(@RequestParam("id") int id){
        realTimeRulesService.delete(id);
        return "delete";
    }

    /**
     * insert
     */
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public String insert(@RequestParam("preference") String preference,
                         @RequestParam("interested") String interested,
                         @RequestParam("may_interested") String may_interested){
        RealTimeRules realTimeRules = new RealTimeRules();
        realTimeRules.setPreference(preference);
        realTimeRules.setInterested(interested);
        realTimeRules.setMay_interested(may_interested);
        realTimeRules.setCreated(new Date());
        realTimeRules.setUpdated(new Date());
        realTimeRulesService.add(realTimeRules);
        return "insert";
    }

    /**
     * update
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST,
            produces = "application/json; charset=utf-8")
    public String update(@RequestParam("id") int id,
                         @RequestParam("preference") String preference,
                         @RequestParam("interested") String interested,
                         @RequestParam("may_interested") String may_interested,
                         HttpServletResponse resp){
        RealTimeRules realTimeRules = new RealTimeRules();
        realTimeRules.setId(id);
        realTimeRules.setPreference(preference);
        realTimeRules.setInterested(interested);
        realTimeRules.setMay_interested(may_interested);
        realTimeRules.setCreated(new Date());
        realTimeRules.setUpdated(new Date());
        Integer i = realTimeRulesService.update(realTimeRules);

        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(realTimeRules);
//        String str = jsonObject.toString();
        try {
//            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out=resp.getWriter();
            out.println(jsonObject);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "update";
    }


}
