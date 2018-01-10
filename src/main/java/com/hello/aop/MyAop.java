package com.hello.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * <p></p>
 *
 * @author ooooow
 * @Since 2018/1/4
 */
@Aspect
@Component
public class MyAop {

    static final Logger LOG = LoggerFactory.getLogger(MyAop.class);

    //@Around("@within(com.hello.aop.MyAnno)")    //run ok
    @Around("@target (com.hello.aop.MyAnno)")    // run error
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object result = null;
        try {
            LOG.info("around start....");
            result = pjp.proceed();
            LOG.info("around end....");
        }finally {

        }
        return result;
    }
}
