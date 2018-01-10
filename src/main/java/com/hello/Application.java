package com.hello;

import com.hello.service.HelloService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p></p>
 *
 * @author ooooow
 * @Since 2018/1/4
 */
@SpringBootApplication
//@EnableAutoConfiguration
@ComponentScan(basePackages = "com.hello")
@EnableAspectJAutoProxy
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        //HelloService d = context.getBean(HelloService.class);
        //d.sayHello("zhangsan");
    }
}
