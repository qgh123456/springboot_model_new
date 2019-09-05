package com.atqgh.springboot.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author qiguohui
 * @date 2019-09-05 15:26
 * @Description
 */
@Table(name="cardMoney")
@Data
public class CardMoney {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private Double money;
    @Transient
    private Double transferMoney;

}
