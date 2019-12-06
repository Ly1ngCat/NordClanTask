package com.test.service;

public class TestBean {
    public TestBean(String name) {
        this.name = name;
    }

    public TestBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;
}
