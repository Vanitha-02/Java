package com.tutorsdude.accessspecifier.types;

public class Default {

    String name;
    int age;
    int rollNumber;
    String section;

    Default(String name, int age, int rollNumber, String section) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.section = section;

    }
    void DefaultSpecifier(){
        System.out.println("does not access in outside the package");
        Message obj2 = new Message();


    }

}

class Message{
    public static void main(String[] args){

        System.out.println("This is a message");
    }
}
