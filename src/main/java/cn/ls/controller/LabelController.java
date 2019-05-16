package cn.ls.controller;

import cn.ls.entity.Label;
import cn.ls.service.LabelService;
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
 */
@Controller
@RequestMapping("/label")
public class LabelController {

    @Autowired
    private LabelService LabelService;

    @RequestMapping(value = "/one", method = RequestMethod.GET)
    public String one(@RequestParam("id") int id) {
        Label one = LabelService.selectOne(id);
        return "one";
    }

    /**
     * list
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list() {
        List<Label> list = LabelService.selectList();
        return "list";
    }

    /**
     * delete
     */
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@RequestParam("id") int id) {
        LabelService.delete(id);
        return "delete";
    }

    /**
     * insert
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestParam("label_classify") String label_classify,
                         @RequestParam("label_name") String label_name) {
        Label Label = new Label();
        Label.setLabel_classify(label_classify);
        Label.setLabel_name(label_name);
        Label.setCreated(new Date());
        Label.setUpdated(new Date());
        LabelService.add(Label);
        return "insert";
    }

    /**
     * update
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST,
            produces = "application/json; charset=utf-8")
    public String update(@RequestParam("id") int id,
                         @RequestParam("label_classify") String label_classify,
                         @RequestParam("label_name") String label_name,
                         HttpServletResponse resp) {
        Label Label = new Label();
        Label.setId(id);
        Label.setLabel_classify(label_classify);
        Label.setLabel_name(label_name);
        Label.setCreated(new Date());
        Label.setUpdated(new Date());
        Integer i = LabelService.update(Label);

        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(Label);
//        String str = jsonObject.toString();
        try {
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter pw = resp.getWriter();
            pw.println(jsonObject);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "update";
    }


}
