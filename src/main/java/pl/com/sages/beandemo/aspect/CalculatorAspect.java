package pl.com.sages.beandemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Aspect
@Slf4j
@Order(1)
public class CalculatorAspect {

    @Before("execution(* pl.com.sages.beandemo.service.CalculatorService.*(..))")
    public void beforeAnyCalculatorOperation(JoinPoint joinPoint) {
        log.info("Before calculator operation: {}", joinPoint.getSignature());
    }

    @Before("execution(* pl.com.sages.beandemo.service.CalculatorService.divide(double, double)) && args(a, b)")
    public void beforeDivideCalculatorOperation(double a, double b) {
        log.info("Before calculator divide operation: {}/{}", a, b);
        if (b == 0) {
            //throw new IllegalArgumentException("Division by zero!");
        }
    }

}
