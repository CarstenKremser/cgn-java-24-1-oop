package org.example;

public class Car {
    String brand;
    String model;
    String color;
    int yearOfManufacture;

    int speed;

    Car(String brand, String model, String color, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
    }
    void start(){
        System.out.println("Car " + brand + " " + model +  " starts.");
    }

    void accelerate() {
        speed += 10;
    }

}
