package pl.com.sages.beandemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.nio.DoubleBuffer;

@Component
@Aspect
@Slf4j
@Order(0)
public class SecondCalculatorAspect {
    @Around("execution(* pl.com.sages.beandemo.service.CalculatorService.*(..))")
    public Object beforeAnyCalculatorMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Before around calculator method call: {}", joinPoint.getSignature());
        try {
            var rv = joinPoint.proceed();
            log.info("After around calculator method call: {}", joinPoint.getSignature());
            return rv;
        } catch (Throwable t) {
            log.info("After around exception calculator method call: {}", joinPoint.getSignature());
            return Double.valueOf(0);
        }

    }
}
