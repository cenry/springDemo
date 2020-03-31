package com.andycen.spring;

/**
 * @author cenruyi
 */
public class CallExample {

    private UserInterface user;

    public void setUser(UserInterface user) {
        this.user = user;
    }

    public UserInterface getUser() {
        return user;
    }

    public CallExample() {}

    public CallExample(UserInterface user) {
        this.user = user;
    }

    public void callSomeOne() {
        System.out.println("call " + user.getName() + "!");
    }
}
