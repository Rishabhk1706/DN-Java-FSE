package com.library.aspect;

public class LoggingAspect {

    public Object logExecutionTime(org.aspectj.lang.ProceedingJoinPoint joinPoint) throws Throwable {

        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long end = System.currentTimeMillis();

        System.out.println(joinPoint.getSignature().getName()
                + " executed in " + (end - start) + " ms");

        return result;
    }
}