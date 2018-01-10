package com.hello.service;

import com.hello.aop.MyAnno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * <p></p>
 *
 * @author ooooow
 * @Since 2018/1/4
 */
@Service
@MyAnno
public class HelloService {

    static final Logger LOG = LoggerFactory.getLogger(HelloService.class);


    public void sayHello(String name){
        LOG.info("hello {}", name);
    }


    public void friend(String name1,String name2){
        LOG.info("{} and {} is friend", name1,name2);
    }

}
