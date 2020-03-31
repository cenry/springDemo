package com.andycen.spring.lifecycle;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cenruyi
 */
public class LifeCycleTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifecycle.xml");
//        System.out.println("=== do something ===");
//        ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();
//        HelloSmartLifeCycle smartLifeCycle = beanFactory.getBean("smartLifeCycle", HelloSmartLifeCycle.class);
//        beanFactory.destroyBean(smartLifeCycle);
//        System.out.println(smartLifeCycle);
//        System.out.println("=== do close ===");
//        applicationContext.close();
//        System.out.println("=== context do start ===");
//        applicationContext.start();
        System.out.println("=== context do close ===");
        applicationContext.close();
//        applicationContext.stop();
//        applicationContext.refresh();
//        applicationContext.start();
    }

}

