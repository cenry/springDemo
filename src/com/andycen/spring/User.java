package com.andycen.spring;

/**
 * @author cenruyi
 */
public class User implements UserInterface {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
