package com.atqgh.springboot.controller;

import com.atqgh.springboot.annotation.AccessLimit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qiguohui
 * @date 2019-09-06 16:20
 * @Description
 */
@RequestMapping("/test3")
@Controller
public class Test3Controller {

    @RequestMapping("/t1")
    @ResponseBody
    @AccessLimit(perSecond=0.3,timeOut = 1)
    public String t1(){
        return "xianliu";
    }
}
