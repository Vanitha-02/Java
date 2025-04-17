package com.tutorsdude.associationPrint.Hospitalism;

public class Address {
    public String name;
    public String area;
    public String city;
    public int pincode;

    public void printAll(){
        System.out.println("Name: " + name);
        System.out.println("Area: " + area);
        System.out.println("City: " + city);
        System.out.println("Pincode: " + pincode);

    }

}
