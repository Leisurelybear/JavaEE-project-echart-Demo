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
        //SELECT * FROM compounds LIMIT 0,10;
        List<Compounds> list = dao.getItems(page, num, like);
        return JSONObject.toJSONString(list);


    }

    public void del(Compounds c) {
        CompoundsExample example = new CompoundsExample();
        example.createCriteria()
                .andChineseNameEqualTo(c.getChineseName())
                .andEnglishNameEqualTo(c.getEnglishName())
                .andTypesEqualTo(c.getTypes());
        dao.deleteByExample(example);
    }
}
