package com.telran.org.HomeWork;

public class Person {
    // Instance variables
    private String name;
    private String fullName;
    private int age;

    // Constructor

    public void move(String location) {
        System.out.println(fullName + " is moving to " + location);
    }

    public void talk(String message) {
        System.out.println(fullName + " says: " + message);
    }

    public Person() {

    }

    public Person(String name, String fullName, int age) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}