package com.atqgh.springboot.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author qiguohui
 * @date 2019-09-03 11:31
 * @Description
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {

    BRAND_CREATE_FAILED(305, "失败");
    private int code;
    private String msg;
}
