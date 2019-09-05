package com.atqgh.springboot.test;

import com.atqgh.springboot.common.result.ResponseModel;
import com.atqgh.springboot.entity.Role;

/**
 * @author qiguohui
 * @date 2019-09-02 19:29
 * @Description
 */
public class Test02 {

    public static void main(String[] args) {
        Role role = new Role();
        role.setName("ere");
        role.setId(2);
        ResponseModel<Role> responseModel = new ResponseModel<Role>();
        responseModel.setCode("successful");
        responseModel.setStatus(200);
        responseModel.setMessage("hahah");
//        responseModel.setResult(role);
//        responseModel.
    }
}
