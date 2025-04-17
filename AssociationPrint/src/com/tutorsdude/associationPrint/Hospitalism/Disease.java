package com.tutorsdude.associationPrint.Hospitalism;

public class Disease {
    public String name;
    public String severity;
    public String cause;


    public void printAll(){
        System.out.println("Name:"+name);
        System.out.println("Severity:"+severity);
        System.out.println("Cause:"+cause);

    }
}
