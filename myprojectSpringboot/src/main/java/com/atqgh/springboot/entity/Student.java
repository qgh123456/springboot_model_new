package com.atqgh.springboot.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author qiguohui
 * @date 2019-09-03 18:08
 * @Description
 */
@Data
public class Student implements Serializable {

    @Length(max = 10,message = "The length of name can not exceed 10")
    @NotEmpty(message = "name can not be null")
    private String name;
    @NotEmpty(message = "sex can not be null")
    private String sex;
    @Min(value = 16L)
    @Max(value = 70L)
    private Integer age;
    @Length(max = 20,message = "The length of addr can not exceed 10")
    @NotEmpty(message = "addr can not be null")
    private String addr;

}
