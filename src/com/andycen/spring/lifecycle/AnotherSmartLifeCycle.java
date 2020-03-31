package com.andycen.spring.lifecycle;

import org.springframework.context.SmartLifecycle;

/**
 * @author cenruyi
 */
public class AnotherSmartLifeCycle implements SmartLifecycle {

    private volatile boolean running;

    public AnotherSmartLifeCycle() {
        running = false;
        System.out.println("AnotherSmartLifeCycle 构造方法");
    }

    public void init() {
        System.out.println("AnotherSmartLifeCycle init!!");
    }

    @Override
    public void start() {
        running = true;
        System.out.println("AnotherSmartLifeCycle start!!");
    }

    @Override
    public void stop() {
        running = false;
        System.out.println("AnotherSmartLifeCycle stop!!");
    }

    @Override
    public boolean isRunning() {
        return this.running;
    }

    public void destroy() {
        System.out.println("AnotherSmartLifeCycle destroy!!");
    }

    @Override
    public int getPhase() {
        return -1;
    }

//    @Override
//    public boolean isAutoStartup() {
//        return false;
//    }
}
