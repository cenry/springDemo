package com.andycen.spring.method.replacement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cenruyi
 */
public class ReplacementTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("replacement.xml");
        MyValueCalculator myValueCalculator = applicationContext.getBean("myValueCalculator", MyValueCalculator.class);
        System.out.println(myValueCalculator.computeValue("Andy"));
        System.out.println(myValueCalculator.computeValue(99, "Andy"));
    }
}
