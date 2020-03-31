package com.andycen.spring.lifecycle;

import org.springframework.context.Lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author cenruyi
 */
public class HelloLifeCycle implements Lifecycle {

    private volatile boolean running;

    public HelloLifeCycle() {
        running = false;
        System.out.println("HelloLifeCycle 构造方法");
    }

    public void init() {
        System.out.println("HelloLifeCycle init!!");
    }

    @Override
    public void start() {
        running = true;
        System.out.println("HelloLifeCycle start!!");
    }

    @Override
    public void stop() {
        running = false;
        System.out.println("HelloLifeCycle stop!!");
    }

    @Override
    public boolean isRunning() {
        return this.running;
    }

    public void destroy() {
        System.out.println("HelloLifeCycle destroy!!");
    }
}
