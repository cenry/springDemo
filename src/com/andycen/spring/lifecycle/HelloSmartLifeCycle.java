package com.andycen.spring.lifecycle;

import org.springframework.context.SmartLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author cenruyi
 */
public class HelloSmartLifeCycle implements SmartLifecycle {

    private volatile boolean running;

    public HelloSmartLifeCycle() {
        running = false;
        System.out.println("HelloSmartLifeCycle 构造方法");
    }

    public void init() {
        System.out.println("HelloSmartLifeCycle init!!");
    }

    @Override
    public void start() {
        running = true;
        System.out.println("HelloSmartLifeCycle start!!");
    }

    @Override
    public void stop() {
        running = false;
        System.out.println("HelloSmartLifeCycle stop!!");
    }

//    @Override
//    public void stop(Runnable callback) {
//        stop();
//        callback.run();
//        System.out.println("HelloSmartLifeCycle-Runnable callback stop!!");
//    }

    @Override
    public boolean isRunning() {
        return this.running;
    }

    public void destroy() {
        System.out.println("HelloSmartLifeCycle destroy!!");
    }

    @Override
    public int getPhase() {
        return 1;
    }

}
