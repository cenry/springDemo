package com.andycen.spring.processor;

public class BasicDataSource {

    private String driverClassName;

    private String url;

    private String username;

    private String password;

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "driverClassName: " + driverClassName + "\n" +
                "url: " + url + "\n" +
                "username: " + username + "\n" +
                "password: " + password + "\n";
    }
}
