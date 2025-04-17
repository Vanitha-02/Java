package com.tutorsdude.inheritance01;

public class SingleRunner {
    public static void main(String[] args){

        Vehicle vehicle=new Vehicle();
        vehicle.name="car";
        System.out.println(vehicle.name);
        vehicle.price=100000;
        System.out.println(vehicle.price);

        Car car=new Car();
        car.name="Maruthi Suzuki";
        System.out.println(car.name);
        car.price=200000;
        System.out.println(car.price);
    }
}
