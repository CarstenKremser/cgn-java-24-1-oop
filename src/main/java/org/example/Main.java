package org.example;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "3 series", "black", 2005);

        car1.start();

        Car car2 = new Car("Mercedes", "B class", "white", 2015);

        System.out.println("current speed of car2: " + car2.speed);
        car2.accelerate();
        System.out.println("current speed of car2: " + car2.speed);


        Person carsten = new Person("Carsten", 56, 'm');
        carsten.introduce();

        Person svenja = new Person("Svenja", 51, 'w');
        svenja.introduce();

    }
}