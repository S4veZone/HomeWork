package com.telran.org.HomeWork.Homework2;

public class Main {
    public static void main(String[] args) {
        ButtonPhone buttonPhone = new ButtonPhone("Daniel", "123456789");
        SmartPhone smartPhone = new SmartPhone("Larisa", "987654321");
        RadioPhone radioPhone = new RadioPhone("Ivan", "555555555");

        buttonPhone.call("111111111");
        buttonPhone.receiveCall("222222222");

        smartPhone.call("333333333");
        smartPhone.receiveCall("444444444");

        radioPhone.call("777777777");
        radioPhone.receiveCall("888888888");
    }
}
