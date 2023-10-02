package com.telran.org.HomeWork;

public class PhoneHW {
    public static void main(String[] args) {
        Phone phone1 = new Phone ("123-321-123" , "iPhone 8", 150);
        Phone phone2 = new Phone ("111-111-111" , "Samsung 20", 160);
        Phone phone3 = new Phone ("333-333-333" , "Xiaomi 13", 180);

        System.out.println("Phone 1:");
        phone1.displayInfo();
        System.out.println(" ");
        System.out.println("Phone 2:");
        phone2.displayInfo();
        System.out.println("");
        System.out.println("Phone 3:");
        phone3.displayInfo();
    }
}
