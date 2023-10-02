package com.telran.org.HomeWork;

public class PersonHW {
    public static void main(String[] args) {


        Person person1 = new Person();
        Person person2 = new Person("Daniel", "Daniel Pislaru", 29);

        person1.setName("Dima");
        person1.setFullName("Buba");
        person1.setAge(30);

        System.out.println("Person 1 Name = " + person1.getName() );
        System.out.println("Person 1 FullName = " + person1.getFullName() );
        System.out.println("Person 1 Age = " + person1.getAge() );
        System.out.println("Person 2 Name = " + person2.getName() );
        System.out.println("Person 2 FullName = " + person2.getFullName() );
        System.out.println("Person 2 Age = " + person2.getAge() );
        person1.move("Zoo");
        person1.talk("is beutiful");


    }
}
