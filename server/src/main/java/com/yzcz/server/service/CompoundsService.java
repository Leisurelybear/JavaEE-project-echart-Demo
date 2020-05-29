/**
 * FileName: CompoundsService
 * Author:   jason
 * Date:     2020/5/30 0:23
 * Description:
 */
package com.yzcz.server.service;

import com.alibaba.fastjson.JSONObject;
import com.yzcz.server.mapper.CompoundsMapper;
import com.yzcz.server.model.Compounds;
import com.yzcz.server.model.CompoundsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompoundsService {

    @Autowired
    private CompoundsMapper dao;
    public String getItems(Integer page, Integer num, String like) {
        //分页查询，未完成
        CompoundsExample example = new CompoundsExample();
        example.createCriteria().andEnglishNameIsNotNull();
        List<Compounds> list = dao.selectByExample(example);
        return JSONObject.toJSONString(list);


    }
}
