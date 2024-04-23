package org.canisminor.spring6.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LogAspect {

    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("[日志] 前置通知: 方法名: " + methodName + ", 参数: " + Arrays.toString(args));
    }


    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[日志] 后置通知: 方法名: " + methodName);
    }


    public void afterReturningMethod(JoinPoint joinPoint, int result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[日志] 返回通知: 方法名: " + methodName + ", 返回值: " + result);
    }


    public void afterThrowingMethod(JoinPoint joinPoint, Throwable exception) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("[日志] 异常通知: 方法名: " + methodName + ", 异常: " + exception);
    }

    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        Object result = null;
        try {
            System.out.println("[日志] 环绕通知(目标方法执行) ");
            result = joinPoint.proceed();
            System.out.println("[日志] 环绕通知(目标方法返回) ");
        } catch (Throwable throwable) {

            System.out.println("[日志] 环绕通知(目标方法出现异常) ");
        } finally {
            System.out.println("[日志] 环绕通知(目标方法执行完毕) ");
        }
        return result;
    }

}
