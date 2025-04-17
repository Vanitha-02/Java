package com.tutorsdude.associationPrint.Hospitalism;

public class Patient {
    public String name;
    public Disease disease;
    public  String address;
    public int age;

    public void printAll(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Age:"+age);
    }

}
