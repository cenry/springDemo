package com.andycen.spring.annotation;

import org.springframework.context.annotation.Bean;

/**
 * @author cenruyi
 */
public class MyBeanFactory {

    @Bean
    public MyBeanA getMyBeanA() {
        return new MyBeanA();
    }

    @Bean
    public MyBeanB getMyBeanB() {
        MyBeanB myBeanB = new MyBeanB();
        myBeanB.setFrom("I'm from annotation");
        return new MyBeanB();
    }

}
