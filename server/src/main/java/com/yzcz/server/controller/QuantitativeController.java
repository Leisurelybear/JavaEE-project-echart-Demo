/**
 * FileName: QuantitativeController
 * Author:   jason
 * Date:     2020/5/27 13:00
 * Description:
 */
package com.yzcz.server.controller;

import com.yzcz.server.service.MarkingService;
import com.yzcz.server.service.QuantitativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/quantitative")
public class QuantitativeController {

    @Autowired
    private QuantitativeService service;

    @PostMapping("/querybyname")
    public ResponseEntity<String> query(@RequestParam String componentName){

        String json = service.querybyname(componentName);

        return new ResponseEntity<>(json, HttpStatus.OK);
    }

    @GetMapping("/getComponentNames")
    public ResponseEntity<String> getComponentNames(){

        String json = service.getComponentNames();

        return new ResponseEntity<>(json, HttpStatus.OK);
    }

}
