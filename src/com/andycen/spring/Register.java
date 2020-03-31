package com.andycen.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cenruyi
 */
public class Register {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowiringTest.xml");
        CallExample callExample = (CallExample) applicationContext.getBean("callExample");
        callExample.callSomeOne();
//        MultiCallExample multiCallExample = (MultiCallExample) applicationContext.getBean("multiCallExample");
//        multiCallExample.call();
    }
}
