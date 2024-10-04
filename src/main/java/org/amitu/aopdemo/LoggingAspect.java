package org.amitu.aopdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* org.amitu.aopdemo.ShoppingCartController.checkout(..))")
    public void beforeLogger(JoinPoint jp){
        String args = jp.getArgs()[0].toString();
        System.out.println("Inside before Logger with args "+args);
    }

    @After("execution(* *..*.checkout(..))")
    public void afterLogger(){
        System.out.println("Inside after Logger");
    }

    @Pointcut("execution(* org.amitu.aopdemo.ShoppingCartController.getQuantity())")
    public void afterReturningPointCut(){
    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "strVal")
    public void afterReturning(String strVal){
        System.out.println("After returning value : "+strVal);
    }



}
