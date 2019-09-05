package com.atqgh.springboot.service.impl;

import com.atqgh.springboot.entity.Role;
import com.atqgh.springboot.mapper.RoleMapper;
import com.atqgh.springboot.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public Role findRole(Role role) {
        return roleMapper.findRole(role);
//        return roleMapper.selectOne(role);
    }

    @Override
    public int saveRole(Role role) {
        int num = roleMapper.insert(role);
        System.out.println(role.toString());
        return num;
    }


}
