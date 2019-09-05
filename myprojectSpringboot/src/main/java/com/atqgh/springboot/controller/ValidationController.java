package com.atqgh.springboot.controller;

import com.atqgh.springboot.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * @author qiguohui
 * @date 2019-09-04 17:56
 * @Description  这里加了对传过来的参数进行验证，如果不符合条件则报异常
 */
@Controller
@Validated
public class ValidationController {

    @RequestMapping("/test3")
    @ResponseBody
    public String test3(@Valid User user){
        return "2222";
    }

}
