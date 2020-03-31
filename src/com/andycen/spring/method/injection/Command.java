package com.andycen.spring.method.injection;

/**
 * @author cenruyi
 */
public class Command {

    private Object state;

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public Object execute() {
        return state;
    }
}
