package com.atqgh.springboot.service;

import com.atqgh.springboot.entity.Role;

public interface RoleService {

    public Role findRole(Role role);
    public int saveRole(Role role);

}
