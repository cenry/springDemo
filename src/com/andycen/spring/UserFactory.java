package com.andycen.spring;

/**
 * @author cenruyi
 */
public class UserFactory {

    public User createUser(String name) {
        User user = new User();
        user.setName(name);
        return user;
    }

}
