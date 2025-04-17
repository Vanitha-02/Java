package com.tutorsdude.Inheritance.hierarchical;

public class HeirarchicalRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.brand);
        System.out.println(vehicle.model);

        Scooty scooty = new Scooty();
        System.out.println(scooty.brand);
        System.out.println(scooty.model);

        Activa activa = new Activa();
        System.out.println(activa.brand);
        System.out.println(activa.model);

        Suzuki suzuki = new Suzuki();
        System.out.println(suzuki.brand);
        System.out.println(suzuki.model);

        Yamaha yamaha = new Yamaha();
        System.out.println(yamaha.brand);
        System.out.println(yamaha.model);

        Honda honda = new Honda();
        System.out.println(honda.brand);
        System.out.println(honda.model);

        Jupiter jupiter = new Jupiter();
        System.out.println(jupiter.brand);
        System.out.println(jupiter.model);

    }
}
