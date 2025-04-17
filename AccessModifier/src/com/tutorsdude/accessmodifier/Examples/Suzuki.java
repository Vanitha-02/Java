package com.tutorsdude.accessmodifier.Examples;

public class Suzuki{
    public static String brand;
    public int price;
    public String model;
    public String color;
    public static String manufacturedBy;
    public static int establishedYear;

    public void printAll(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Manufactured by: " + manufacturedBy);
        System.out.println("Established year: " + establishedYear);

    }


}
