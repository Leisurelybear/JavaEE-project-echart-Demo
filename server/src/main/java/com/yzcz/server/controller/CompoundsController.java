/**
 * FileName: CompoundsController
 * Author:   jason
 * Date:     2020/5/30 0:20
 * Description:
 */
package com.yzcz.server.controller;


import com.yzcz.server.model.Compounds;
import com.yzcz.server.service.CompoundsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/compounds")
public class CompoundsController {

    @Autowired
    private CompoundsService service;

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
    public ResponseEntity<String> del(@RequestBody(required = false) Compounds c){
        System.out.println(c);
        service.del(c);
        return new ResponseEntity<>("true", HttpStatus.OK);
    }


}
