package pl.com.sages.beandemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
@Order(0)
public class SecondCalculatorAspect {

    @Around("execution(* pl.com.sages.beandemo.service.CalculatorService.*(..))")
    public Object aroundAnyCalculatorOperation(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Before around calculator operation");
        //Object rv = joinPoint.proceed();
        log.info("After around calculator operation");
        return Double.valueOf(-1);
    }
 }
