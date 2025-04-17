package com.tutorsdude.accessspecifier.types;
public class Private {


    private String name;
    private int age;
    private int rollNumber;
    private String section;

    private Private(String name, int age, int rollNumber, String section) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
        this.section = section;
    }

    private void PrivateSpecifier() {
        System.out.println("inside class");
        Person obj=new Person();
    }

    public static void main(String[] args) {

        Private obj3 = new Private("Manoj",20,24,"A");
        System.out.println(obj3.name);
        System.out.println(obj3.age);
        System.out.println(obj3.rollNumber);
        System.out.println(obj3.section);

        obj3.PrivateSpecifier();

    }


       private class Person{

       }

        }



