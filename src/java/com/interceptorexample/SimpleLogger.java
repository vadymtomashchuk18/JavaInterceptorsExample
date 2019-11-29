
package com.interceptorexample;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class SimpleLogger {
    
    @AroundInvoke
    public Object logAction(InvocationContext context) throws Exception {
        System.out.println("object  - " + context.getTarget().getClass());
        System.out.println( "method - " + context.getMethod());       
        
        return context.proceed();
    }
    
}
