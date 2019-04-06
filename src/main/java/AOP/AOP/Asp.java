package AOP.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Asp {

    @Pointcut("execution(* *.method())")
    private void allLogEventMethods() {
    }


    @Around("allLogEventMethods()")
    public void logBefore(ProceedingJoinPoint pjp) {
        System.out.println("proxy");
        try {
            pjp.proceed();
        } catch (Throwable e) {
            System.out.println("CATCH in PROXY");
        }
    }
}
