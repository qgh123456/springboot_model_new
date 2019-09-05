package com.atqgh.springboot.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name="role")
@Data
public class Role implements Serializable {
    //主键id
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    //角色名称
    private String name;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
