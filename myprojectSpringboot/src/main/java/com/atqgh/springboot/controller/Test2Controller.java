package com.atqgh.springboot.controller;

import com.atqgh.springboot.common.result.ResponseModel;
import com.atqgh.springboot.entity.CardMoney;
import com.atqgh.springboot.entity.Student;
import com.atqgh.springboot.service.CardMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qiguohui
 * @date 2019-09-03 18:25
 * @Description
 */
@Controller
public class Test2Controller {
    @Autowired
    CardMoneyService cardMoneyService;

    @RequestMapping("/tt")
    @ResponseBody
    public String tt(@Validated Student student){
        System.out.println(student.toString());
        return student.toString();
    }

    @RequestMapping("/transfer")
    @ResponseBody
    public ResponseModel<CardMoney> transfer(){
        cardMoneyService.transfer();
        ResponseModel<CardMoney> responseModel = new ResponseModel();
        responseModel.setMessage("成功!");
        return responseModel;
    }
}
