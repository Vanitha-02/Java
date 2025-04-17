package com.tutorsdude.Inheritance.multiple;

public class MultipleRunner {
    public static void main(String[] args) {

        Yamaha yamaha = new Yamaha();

        System.out.println(yamaha.price);
        System.out.println(yamaha.model);

        Brand brand= new Brand();

        System.out.println(brand.price);
        System.out.println(brand.model);

        Bike bike = new Bike();

        System.out.println(bike.price);
        System.out.println(bike.model);

    }
}
