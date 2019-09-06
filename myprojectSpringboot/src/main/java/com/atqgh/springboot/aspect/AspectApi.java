package com.atqgh.springboot.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import java.lang.reflect.Method;

/**
 * @author qiguohui
 * @date 2019-09-06 15:53
 * @Description
 */
public interface AspectApi {

    Object doHandlerAspect(ProceedingJoinPoint pjp, Method method)throws Throwable;

}
