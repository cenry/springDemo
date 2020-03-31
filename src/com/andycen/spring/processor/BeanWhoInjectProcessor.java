package com.andycen.spring.processor;

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
