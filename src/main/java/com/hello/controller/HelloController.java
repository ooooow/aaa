package com.hello.controller;

import com.hello.aop.MyAnno;
import com.hello.service.HelloService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 *
 * @author ooooow
 * @Since 2018/1/4
 */
@RestController
@MyAnno
public class HelloController {

    static final Logger LOG = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    HelloService helloService;
    @RequestMapping("/hello")
    String home(){
        LOG.info("hello home()");
        helloService.sayHello("zhangsan");
        return "hello";
    }
}
