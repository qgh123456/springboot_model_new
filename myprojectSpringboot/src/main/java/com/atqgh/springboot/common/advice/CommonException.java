package com.atqgh.springboot.common.advice;

import com.atqgh.springboot.common.enums.ExceptionEnum;
import com.atqgh.springboot.common.result.ExceptionResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Path;
import java.util.List;
import java.util.Set;

/**
 * @author qiguohui
 * @date 2019-09-03 12:16
 * @Description
 */
@ControllerAdvice
public class CommonException {
    @ExceptionHandler(com.atqgh.springboot.common.exception.CommonException.class)
    public ResponseEntity<ExceptionResult> handleException2(com.atqgh.springboot.common.exception.CommonException ex){
        ResponseEntity<ExceptionResult> resultResponseEntity = ResponseEntity.status(333)
                .body(new ExceptionResult(ex.getExceptionEnum()));
        return resultResponseEntity;
    }

    //拦截其他未拦截的异常
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResult> handleException3(Exception ex){
        ExceptionEnum exceptionEnum = ExceptionEnum.BRAND_CREATE_FAILED;
        ResponseEntity<ExceptionResult> resultResponseEntity = ResponseEntity.status(333)
                .body(new ExceptionResult(exceptionEnum));
        System.out.println(resultResponseEntity);
        return resultResponseEntity;
    }

    /**
     * 统一处理请求参数校验(实体对象传参)
     * @param e BindException
     * @return FebsResponse
     */
    @ExceptionHandler(org.springframework.validation.BindException.class)
    public ResponseEntity<ExceptionResult> validExceptionHandler(BindException e) {
        StringBuilder message = new StringBuilder();
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        for (FieldError error : fieldErrors) {
            message.append(error.getField() + ":").append(error.getDefaultMessage()).append(",");
        }
        message = new StringBuilder(message.substring(0, message.length() - 1));
        //转化为String
        String msg = message + "";
        ResponseEntity<ExceptionResult> resultResponseEntity = ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ExceptionResult(HttpStatus.BAD_REQUEST.value(),msg));
        return resultResponseEntity;
    }

    /**
     * 统一处理请求参数校验(普通传参)
     * @param e ConstraintViolationException
     * @return FebsResponse
     */
    @ExceptionHandler(value = ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ResponseEntity<ExceptionResult> handleConstraintViolationException(ConstraintViolationException e) {
        StringBuilder message = new StringBuilder();
        Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
        for (ConstraintViolation<?> violation : violations) {
            Path path = violation.getPropertyPath();
            String[] pathArr = StringUtils.splitByWholeSeparatorPreserveAllTokens(path.toString(), ".");
            message.append(pathArr[1]).append(violation.getMessage()).append(",");
        }
        message = new StringBuilder(message.substring(0, message.length() - 1));
        //转化为String
        String msg = message + "";
        ResponseEntity<ExceptionResult> resultResponseEntity = ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ExceptionResult(HttpStatus.BAD_REQUEST.value(),msg));
        return resultResponseEntity;
    }

}
