package com.atqgh.springboot.common.constant;

import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author qiguohui
 * @date 2019-09-03 17:31
 * @Description
 */

@PropertySource(value = {"classpath:constant.properties"})
@ConfigurationProperties(prefix = "person")
@Component(value = "constant")
@Setter
public class Constant {
    private String name;
}
