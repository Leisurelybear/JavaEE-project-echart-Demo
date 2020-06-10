/**
 * FileName: ExperimentService
 * Author:   jason
 * Date:     2020/6/10 20:19
 * Description:
 */
package com.yzcz.server.service;

import com.alibaba.fastjson.JSONObject;
import com.yzcz.server.mapper.ExperimentMapper;
import com.yzcz.server.model.CompoundsExample;
import com.yzcz.server.model.Experiment;
import com.yzcz.server.model.ExperimentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperimentService {

    @Autowired
    private ExperimentMapper dao;

    public String getItems(Integer page, Integer num, String like) {

        List<Experiment> list = dao.getItems(page, num, like);
        return JSONObject.toJSONString(list);

    }

    public void del(Experiment e) {
        dao.deleteByPrimaryKey(e.getId());
    }

    public void save(Experiment oldObj, Experiment newObj) {
        ExperimentExample example = new ExperimentExample();

        dao.updateByPrimaryKey(newObj);


    }

    public void add(Experiment e) {

        dao.insert(e);

    }
}
