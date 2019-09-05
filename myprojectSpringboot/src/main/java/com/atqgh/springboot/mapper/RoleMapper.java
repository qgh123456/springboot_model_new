package com.atqgh.springboot.mapper;

import com.atqgh.springboot.entity.Role;
import tk.mybatis.mapper.common.Mapper;

public interface RoleMapper extends Mapper<Role> {

    //根据条件查找
    public Role findRole(Role role);
}
