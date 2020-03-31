package com.andycen.spring.method.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cenruyi
 */
public class CommonTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("methodInjection.xml");
        CommandManager commandManager = (CommandManager) applicationContext.getBean("commandManager");
        System.out.println(commandManager.process("aaa"));
    }
}
