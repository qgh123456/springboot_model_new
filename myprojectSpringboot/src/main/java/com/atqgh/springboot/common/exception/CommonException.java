package com.atqgh.springboot.common.exception;

import com.atqgh.springboot.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author qiguohui
 * @date 2019-09-03 11:39
 * @Description
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CommonException extends RuntimeException {
    private ExceptionEnum exceptionEnum;
}
