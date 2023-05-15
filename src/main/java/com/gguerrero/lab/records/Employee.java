package com.gguerrero.lab.records;

public class Employee {

    private final String name;
    private final String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
