package com.andycen.spring.proxy;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author cenruyi
 */
public class BeanWhoInjectProcessor {

    private BeanPostProcessor beanPostProcessor;

    public void setBeanPostProcessor(BeanPostProcessor beanPostProcessor) {
        this.beanPostProcessor = beanPostProcessor;
    }
}
