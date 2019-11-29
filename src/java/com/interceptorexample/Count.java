
package com.interceptorexample;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.interceptor.Interceptors;

@Stateless
@Named("count")
@Interceptors(LifeLogger.class)
public class Count implements Serializable{
    
    double firstArgument=0;
    double secondArgument=0;

    public Count(){
    super();
    }
    public double getFirstArgument() {
        return firstArgument;
    }

    public double getSecondArgument() {
        return secondArgument;
    }
  
    public void setSecondArgument(double secondArgument) {
        this.secondArgument = secondArgument;
    }

    public void setFirstArgument(double firstArgument) {
        this.firstArgument = firstArgument;
    }

    @Interceptors(SimpleLogger.class)
    public double getSummResult() {
        return getFirstArgument()+ getSecondArgument();
    }
    
   public double  getMultiplyResult(){
         return getFirstArgument() * getSecondArgument();
    }
}
