package com.atqgh.springboot.aspect;

import com.atqgh.springboot.common.base.Constant;
import org.aspectj.lang.ProceedingJoinPoint;
import java.lang.reflect.Method;

/**
 * @author qiguohui
 * @date 2019-09-06 15:56
 * @Description  做一些公共的配置
 */
public class AspectApiImpl implements AspectApi {

    @Override
    public Object doHandlerAspect(ProceedingJoinPoint pjp, Method method) throws Throwable {
        Constant.isPass=false;
        return null;
    }
}
