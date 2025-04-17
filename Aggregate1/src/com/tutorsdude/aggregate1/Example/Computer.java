package com.tutorsdude.aggregate1.Example;

public class Computer {
    public String brand;
    public Monitor monitor;
    public Display display;
    public Keyboard keyboard;
    public Ram[] ram;
    public Speaker[] speaker;

    public void printAll(){
        System.out.println("Computer Brand:"+brand);
        System.out.println("Monitor:"+monitor);
        System.out.println("Display:"+display);
        System.out.println("Keyboard:"+keyboard);
        System.out.println("Ram:"+ram);
        System.out.println("Speaker:"+speaker);
    }


}
