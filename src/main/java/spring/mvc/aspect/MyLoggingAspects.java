package spring.mvc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspects {

    @Around("execution(* spring.mvc.dao.*.*(..))")
    public Object aroundAllRepositoryMethodAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName =  methodSignature.getName();
        System.out.println("begin of " + methodName);
        Object target = proceedingJoinPoint.proceed();
        System.out.println("end of " + methodName);
        return target;
    }
}
