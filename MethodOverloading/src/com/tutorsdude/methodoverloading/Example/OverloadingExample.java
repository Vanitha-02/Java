package com.tutorsdude.methodoverloading.Example;

public class OverloadingExample {


//Changing number of parameters
    public static int sub(int c,int d){
        int subValue=c-d;
        return  subValue;
    }
    public static int sub(int c,int d,int e) {
        int subValue = c-d-e;
        return subValue;
    }
    public static int sub(int c,int d,int e,int f) {
        int subValue = c-d-e-f;
        return subValue;
    }
    //changing type of parameters

    public void channel(long number){
        System.out.println("Channel number:" + number);
    }
    public void channel(String name){
        System.out.println("Channel names:" + name);
    }
    public void channel(int price){
        System.out.println("Channel price is:" + price);

    }

    public void phone(String name,int price){
        System.out.println("Phone name:" + name + "," + "phone price:" + price);
    }
    public void phone(int price,String name){
        System.out.println("phone price:" + price + "," + "Phone name:" + name );
    }







}
