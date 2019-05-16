package cn.ls.service;

import cn.ls.dao.LabelMapper;
import cn.ls.entity.Label;
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
public class LabelServiceImpl implements LabelService {

    @Autowired
    private cn.ls.dao.LabelMapper LabelMapper;

    @Override
    public Integer add(Label Label) {
        return LabelMapper.insert(Label);
    }

    @Override
    public void delete(Integer id) {
        LabelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer update(Label Label) {
        return LabelMapper.updateByPrimaryKeySelective(Label);
    }

//    @Override
    public List<Label> selectList() {
        List<Label> list = LabelMapper.selectList();
        return list;
    }

    @Override
    public Label selectOne(Integer id) {
        Label Label = LabelMapper.selectByPrimaryKey(id);
        return Label;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        LabelService service = ctx.getBean(LabelService.class);
        List<Label> list = service.selectList();
        Label selectOne = service.selectOne(1);

        service.delete(1);

        Label label = new Label();
        label.setCreated(new Date());
        label.setUpdated(new Date());
        label.setLabel_classify("社会属性");
        label.setLabel_name("职业");
        label.setLabel_value("写字楼民工");
        Integer add = service.add(label);

        label.setId(3);
        Integer update = service.update(label);
    }
}
