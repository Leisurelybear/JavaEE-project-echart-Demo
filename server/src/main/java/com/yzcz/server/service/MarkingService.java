/**
 * FileName: MarkingService
 * Author:   jason
 * Date:     2020/5/27 1:19
 * Description:
 */
package com.yzcz.server.service;

import com.alibaba.fastjson.JSONObject;
import com.yzcz.server.mapper.MarkingInformationMapper;
import com.yzcz.server.model.MarkingInformation;
import com.yzcz.server.model.MarkingInformationExample;
import com.yzcz.server.model.QuantitativeResultsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
public class MarkingService {


    @Autowired
    private MarkingInformationMapper markingDAO;

    public String query(){

        MarkingInformationExample example = new MarkingInformationExample();
        example.createCriteria().andComponentNameIsNotNull();
        List<MarkingInformation> list = markingDAO.selectByExample(example);

        Assert.notNull(list, "数据库表格读取失败！");

        String json = JSONObject.toJSONString(list);
        return json;
    }


    public String querybyname(String componentName) {
        MarkingInformationExample example = new MarkingInformationExample();
        example.createCriteria().andComponentNameEqualTo(componentName);
        List<MarkingInformation> list = markingDAO.selectByExample(example);

        Assert.notNull(list, "数据库表格读取失败！");

        String json = JSONObject.toJSONString(list);
        return json;
    }

    public String getComponentNames() {

        MarkingInformationExample example = new MarkingInformationExample();

        List<String> list = markingDAO.getComponentNames();

        return JSONObject.toJSONString(list);
    }
}
