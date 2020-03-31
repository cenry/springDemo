package com.andycen.spring;

import java.util.List;
import java.util.Map;

/**
 * @author cenruyi
 */
public class MultiCallExample {

//    UserInterface user;

    List<UserInterface> users;

    public void setUsers(List<UserInterface> users) {
        this.users = users;
    }

//    Map<String, UserInterface> users;
//
//    public void setUsers(Map<String, UserInterface> users) {
//        this.users = users;
//    }

//    public MultiCallExample(UserInterface user) {
//        this.user = user;
//    }

    public void call() {
        users.forEach(user -> System.out.println("call " + user.getName() + ","));
//        users.forEach((k, v) -> System.out.println("key:  " + k));
//        users.forEach((k, v) -> System.out.println("call " + v.getName() + ","));
    }

}
