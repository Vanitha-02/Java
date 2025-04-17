package com.tutorsdude.accessmodifier;

import com.tutorsdude.accessmodifier.Examples.*;

public class StaticRunner {
    public static void main(String[] args) {
        ParleCompany.brand="parle";
        ParleCompany.manufacturedBy="Parle Company";
        ParleCompany.establishedYear=1929;

        SamsungCompany.brand="samsung";
        SamsungCompany.manufacturedBy="Samsung Company";
        SamsungCompany.establishedYear=1930;

        Student.name="rohan";
        Student.gender="male";

        Suzuki.brand="suzuki";
        Suzuki.manufacturedBy="Suzuki company";
        Suzuki.establishedYear=1909;

        Honda.brand="honda";
        Honda.manufacturedBy="Honda Company";
        Honda.establishedYear=1948;



        ParleCompany  company = new ParleCompany();
        company.price=200;
        company.productNames="Parle-G";

        company.printAll();

        SamsungCompany samsungCompany = new SamsungCompany();
        samsungCompany.price=30000;
        samsungCompany.Products="Samsung mobile";

        samsungCompany.printAll();


        Student student = new Student();
        student.age=22;
        student.semester=4;
        student.printAll();


        Suzuki suzuki = new Suzuki();
        suzuki.price=30000;
        suzuki.model="car";
        suzuki.color="blue";


        suzuki.printAll();

        Honda honda = new Honda();
        honda.price=30000;
        honda.model="bike";
        honda.color="black";

        honda.printAll();

    }
}
