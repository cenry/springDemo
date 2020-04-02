package com.andycen.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author cenruyi
 */
public class MyBeanA {

    private MyBeanB myBeanB;

    @Autowired
    public void setMyBeanB(MyBeanB myBeanB) {
        this.myBeanB = myBeanB;
    }

    public MyBeanB getMyBeanB() {
        return myBeanB;
    }
}
