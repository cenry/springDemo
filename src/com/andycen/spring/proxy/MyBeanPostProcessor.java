package com.andycen.spring.proxy;

import com.andycen.spring.lifecycle.HelloLifeCycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author cenruyi
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

//    @Autowired
//    private HelloLifeCycle helloLifeCycle;

//    public void setHelloLifeCycle(HelloLifeCycle helloLifeCycle) {
//        this.helloLifeCycle = helloLifeCycle;
//    }

    // simply return the instantiated bean as-is
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("Bean '" + beanName + "' before initialization : " + bean.toString());
        return bean; // we could potentially return any object reference here...
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("Bean '" + beanName + "' after initialization : " + bean.toString());
        return bean;
    }

}
