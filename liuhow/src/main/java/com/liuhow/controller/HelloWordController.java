package com.liuhow.controller;

import com.liuhow.domain.Code;
import com.liuhow.domain.ResultMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuhao
 * @create 2021-01-25
 */
@RestController
public class HelloWordController {

    @RequestMapping("/hello/{$name}")
    public ResultMap helloWord(@PathVariable String name) {
        ResultMap map = new ResultMap();
        map.setCode(Code.getSuccessCode());
        map.setMessage("hello word" + name);
        map.setData("aa");
        return map;
    }
}
