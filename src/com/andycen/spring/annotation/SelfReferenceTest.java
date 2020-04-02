package com.andycen.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cenruyi
 */
public class SelfReferenceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation.xml");
        MyBeanA bean = applicationContext.getBean(MyBeanA.class);
        System.out.println(bean.getMyBeanB().getFrom());
    }
}
