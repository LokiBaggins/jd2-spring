package jd2.baggins.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectLogger {

    @Before(value = "execution(* jd2.baggins.pojos.Occupation.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("Before method: " + joinPoint.getSignature().getName());
    }

    public void after() {
        System.out.println("After method");
    }

    public void around() {
        System.out.println("After method");
    }
}
