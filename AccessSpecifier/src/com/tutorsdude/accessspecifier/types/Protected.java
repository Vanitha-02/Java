package com.tutorsdude.accessspecifier.types;

public class Protected {
    protected String name;
    protected int age;
    protected int rollNumber;
    protected String section  ;

    protected Protected  (String name, int age, int rollNumber, String section) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.section = section;

    }
    protected void ProtectedSpecifier(){
        System.out.println("using inheritance");
    }
    Protected pro=new Protected("lila",20,25,"A");
}
