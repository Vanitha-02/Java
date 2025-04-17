package com.tutorsdude.Inheritance.multilevel;

public class multilevelRunner {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.price);
        System.out.println(vehicle.model);

        Car car = new Car();
        System.out.println(car.price);
        System.out.println(car.model);

        Benz benz = new Benz();
        System.out.println(benz.price);
        System.out.println(benz.model);
    }
}
