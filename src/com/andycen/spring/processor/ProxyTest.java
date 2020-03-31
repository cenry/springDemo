package com.andycen.spring.processor;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cenruyi
 */
public class ProxyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanPostProcessor.xml");
        BasicDataSource dataSource = applicationContext.getBean(BasicDataSource.class);
        System.out.println(dataSource.toString());
    }
}
