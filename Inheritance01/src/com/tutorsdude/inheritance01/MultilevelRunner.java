package com.tutorsdude.inheritance01;

public class MultilevelRunner {
    public static void main(String[] args){

        Animal animal=new Animal();
        animal.name="Dog";
        System.out.println(animal.name);
        animal.legs=4;

        DomesticAnimal animal1=new DomesticAnimal();
        animal1.name="Dog";
        System.out.println(animal1.name);
        animal1.legs=4;

        Dog dog=new Dog();
        dog.name="Sparky";
        System.out.println(dog.name);
        dog.legs=4;
        System.out.println(dog.legs);
    }
}
