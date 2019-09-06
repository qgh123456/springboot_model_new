package com.atqgh.springboot.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.Method;

/**
 * @author qiguohui
 * @date 2019-09-06 15:58
 * @Description
 */
public abstract class AbstractAspectManager implements AspectApi {

    private AspectApi aspectApi;

    public AbstractAspectManager(AspectApi aspectApi){
        this.aspectApi=aspectApi;
    }

    @Override
    public Object doHandlerAspect(ProceedingJoinPoint pjp, Method method) throws Throwable {
        return this.aspectApi.doHandlerAspect(pjp,method);
    }

    protected abstract Object execute(ProceedingJoinPoint pjp, Method method)throws Throwable;

}
