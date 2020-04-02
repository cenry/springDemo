package com.andycen.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cenruyi
 */
public class MatchNameTest {

    private AnnotationInterface classA;

    @Autowired
    public void setClassA(AnnotationInterface classA) {
        this.classA = classA;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation.xml");
        MatchNameTest matchNameTest = applicationContext.getBean(MatchNameTest.class);
        System.out.println(matchNameTest.classA.getClass().getName());
    }

}
