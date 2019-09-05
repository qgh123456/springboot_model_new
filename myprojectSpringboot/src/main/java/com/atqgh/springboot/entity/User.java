package com.atqgh.springboot.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * @author qiguohui
 * @date 2019-09-04 17:54
 * @Description
 */
@Setter
@Getter
public class User implements Serializable {
    @NotBlank(message = "{required}")
    private String name;
    @Email(message = "{invalid}")
    @NotBlank(message = "{required}")
    private String email;
}
