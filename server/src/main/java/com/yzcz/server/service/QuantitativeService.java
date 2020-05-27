/**
 * FileName: QuantitativeService
 * Author:   jason
 * Date:     2020/5/27 13:01
 * Description:
 */
package com.yzcz.server.service;

import com.alibaba.fastjson.JSONObject;
import com.yzcz.server.mapper.QuantitativeResultsMapper;
import com.yzcz.server.model.QuantitativeResults;
import com.yzcz.server.model.QuantitativeResultsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuantitativeService {

    @Autowired
    private QuantitativeResultsMapper dao;

    public String querybyname(String componentName) {

        QuantitativeResultsExample example = new QuantitativeResultsExample();
        example.createCriteria().andComponentNameEqualTo(componentName);

        List<QuantitativeResults> list = dao.selectByExample(example);

        return JSONObject.toJSONString(list);

    }

    public String getComponentNames() {

        QuantitativeResultsExample example = new QuantitativeResultsExample();



        List<String> list = dao.getComponentNames();

        return JSONObject.toJSONString(list);

    }
}
