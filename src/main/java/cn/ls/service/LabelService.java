package cn.ls.service;

import cn.ls.entity.Label;

import java.util.List;

/**
 * Created by asong on 2019/5/15.
 */
public interface LabelService {

    Integer add(Label Label);
    void delete(Integer id);
    Integer update(Label Label);
    List<Label> selectList();
    Label selectOne(Integer id);

}
