
package com.interceptorexample;

import javax.annotation.PostConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LifeLogger {
    
     
    @AroundInvoke
    public Object logAll(InvocationContext context) throws Exception {
        System.out.println("LogAll object  - " + context.getTarget().getClass());
        System.out.println("LogAll method - " + context.getMethod());       
        
        return context.proceed();
    }
    
    @PostConstruct
    public Object logCreate(InvocationContext context) throws Exception {
        System.out.println("create  - " + context.getTarget().getClass());     
        
        return context.proceed();
    }
    
}
