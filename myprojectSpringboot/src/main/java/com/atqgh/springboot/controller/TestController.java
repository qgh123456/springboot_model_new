package com.atqgh.springboot.controller;

import com.atqgh.springboot.entity.Role;
import com.atqgh.springboot.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/test")
@Controller
public class TestController {

    @Autowired
    RoleService roleService;

    @RequestMapping("/role")
    @ResponseBody
    public Role findRole(){
        Role role = new Role();
        role.setId(1);
        roleService.findRole(role);
        return role;
    }

    @RequestMapping("/saveRole")
    @ResponseBody
    public String saveRole(){
        Role role = new Role();
        role.setName("xxxx");
        return roleService.saveRole(role) + "";
    }
}
