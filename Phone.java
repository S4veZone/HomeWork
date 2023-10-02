package com.telran.org.HomeWork;

public class Phone {
    // Instance variables
    private String number;
    private String model;
    private int weight;

    // Constructor
    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Getter method for number
    public String getNumber() {
        return number;
    }

    // Setter method for number
    public void setNumber(String number) {
        this.number = number;
    }

    // Getter method for model
    public String getModel() {
        return model;
    }

    // Setter method for model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter method for weight
    public int getWeight() {
        return weight;
    }

    // Setter method for weight
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void displayInfo() {
        System.out.println("Phone Number: " + number);
        System.out.println("Phone Model: " + model);
        System.out.println("Phone Weight: " + weight);
    }

}