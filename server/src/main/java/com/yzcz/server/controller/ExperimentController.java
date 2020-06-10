/**
 * FileName: ExperimentController
 * Author:   jason
 * Date:     2020/6/10 20:17
 * Description:
 */
package com.yzcz.server.controller;


import com.yzcz.server.model.Compounds;
import com.yzcz.server.model.Experiment;
import com.yzcz.server.service.CompoundsService;
import com.yzcz.server.service.ExperimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/experiment")
public class ExperimentController {

    @Autowired
    private ExperimentService service;

    @GetMapping("/getItems")
    public ResponseEntity<String> getItems(
            @RequestParam(value = "page")Integer page,
            @RequestParam(value = "num")Integer num,
            @RequestParam(value = "like")String like
    ){

        String json = service.getItems(page, num, like);

        return new ResponseEntity<>(json, HttpStatus.OK);

    }

    @DeleteMapping("/del")
    public ResponseEntity<String> del(@RequestBody(required = false) Experiment e){
        System.out.println(e);
        service.del(e);
        return new ResponseEntity<>("true", HttpStatus.OK);
    }

    @PutMapping("/save")
    public ResponseEntity<String> save(@RequestBody(required = false) Experiment[] es){

        if (es == null || es.length != 2){
            return new ResponseEntity<>("false", HttpStatus.OK);
        }
        service.save(es[0], es[1]);

        return new ResponseEntity<>("true", HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody(required = false) Experiment e){
        Assert.notNull(e, "Addition must be not null!");
        service.add(e);
        return new ResponseEntity<>("true", HttpStatus.OK);

    }

}
