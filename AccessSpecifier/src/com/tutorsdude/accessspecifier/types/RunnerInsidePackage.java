package com.tutorsdude.accessspecifier.types;

public class RunnerInsidePackage {

    public static void main(String[] args) {

        Public obj = new Public("Manoj",20,21,"A");
        obj.message();
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.rollNumber);
        System.out.println(obj.section);


        Default example=new Default("Manoj",20,21,"A");
        System.out.println(example.name);
        System.out.println(example.age);
        System.out.println(example.rollNumber);
        System.out.println(example.section);

        example.DefaultSpecifier();





    }
}
