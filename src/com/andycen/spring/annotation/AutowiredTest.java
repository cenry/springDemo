package com.andycen.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredTest {

//    private AnnotationInterface annotationInterface;
//
//    @Autowired
//    public void setAnnotationInterface(AnnotationInterface annotationInterface) {
//        this.annotationInterface = annotationInterface;
//    }

//    private AnnotationInterface[] annotationInterfaces;
//    public AutowiredTest(AnnotationInterface[] annotationInterfaces) {
//        this.annotationInterfaces = annotationInterfaces;
//    }

    private AnnotationClassA annotationClassA;

    public AutowiredTest(AnnotationClassA annotationClassA) {
        this.annotationClassA = annotationClassA;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation.xml");
        AutowiredTest autowiredTest = applicationContext.getBean(AutowiredTest.class);
//        System.out.println(autowiredTest.annotationInterface.getClass().getName());
//        System.out.println(autowiredTest.annotationInterfaces.length);
        System.out.println(autowiredTest.annotationClassA.getClass().getName());
    }
}
