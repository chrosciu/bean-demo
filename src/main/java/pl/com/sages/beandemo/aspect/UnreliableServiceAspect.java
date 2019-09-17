package pl.com.sages.beandemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class UnreliableServiceAspect {

    @Around("execution(* pl.com.sages.beandemo.service.UnreliableService.*(..))")
    public Object aroundUnreliableServiceMethod(ProceedingJoinPoint joinPoint) {
        do {
            try {
                Object rv = joinPoint.proceed();
                log.info("Success: {}", rv);
                return rv;
            } catch (Throwable throwable) {
                log.info("Failed, retry...");
            }
        } while (true);
    }
}
