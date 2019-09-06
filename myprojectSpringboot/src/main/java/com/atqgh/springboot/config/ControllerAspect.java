package com.atqgh.springboot.config;

import com.atqgh.springboot.annotation.AccessLimit;
import com.atqgh.springboot.aspect.AccessLimitAspect;
import com.atqgh.springboot.aspect.AspectApiImpl;
import com.atqgh.springboot.util.common.ComUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.mapper.util.StringUtil;

import java.lang.reflect.Method;

/**
 * @author qiguohui
 * @date 2019-09-06 16:00
 * @Description 切面
 */
@Aspect
@Configuration
public class ControllerAspect {

    @Pointcut("execution(* com.atqgh.springboot.controller..*(..))  ")
    public void aspect() {

    }

    @Around(value = "aspect()")
    public Object validationPoint(ProceedingJoinPoint pjp)throws Throwable{
        Method method = currentMethod(pjp,pjp.getSignature().getName());
        //创建被装饰者
        AspectApiImpl aspectApi = new AspectApiImpl();

        //是否需要限流
        if (method.isAnnotationPresent(AccessLimit.class)) {
            new AccessLimitAspect(aspectApi).doHandlerAspect(pjp,method);
        }
        return  pjp.proceed(pjp.getArgs());
    }

    /**
     * 获取目标类的所有方法，找到当前要执行的方法
     */
    private Method currentMethod ( ProceedingJoinPoint joinPoint , String methodName ) {
        Method[] methods      = joinPoint.getTarget().getClass().getMethods();
        Method   resultMethod = null;
        for ( Method method : methods ) {
            if ( method.getName().equals( methodName ) ) {
                resultMethod = method;
                break;
            }
        }
        return resultMethod;
    }
}
