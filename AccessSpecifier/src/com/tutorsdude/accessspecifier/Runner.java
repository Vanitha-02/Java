package com.tutorsdude.accessspecifier;

import com.tutorsdude.accessspecifier.types.Protected;
import com.tutorsdude.accessspecifier.types.Public;

public class Runner {
    public static void main(String[] args) {

        Public obj = new Public("Manoj",20,24,"A");
        System.out.println(obj.age);
        System.out.println(obj.name);

        obj.message();





        

    }
}
