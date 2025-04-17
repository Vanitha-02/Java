package com.tutorsdude.Inheritance.hybrid;

public class hybridRunner {
    public static void main(String[] args) {

        Device device = new Device();
        System.out.println(device.type);

        Scanner scanner = new Scanner();
        System.out.println(scanner.type);

        Copier copier = new Copier();
        System.out.println(copier.type);

        Laptop laptop = new Laptop();
        System.out.println(laptop.type);
    }

}
