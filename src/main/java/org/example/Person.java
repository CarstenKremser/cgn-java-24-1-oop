package org.example;

public class Person {
    String name;
    int age;
    char gender;

    Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void introduce() {
        System.out.println("Hello, I am " + name+ " and " + age + " years old.");
    }
}
