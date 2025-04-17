package com.tutorsdude.methodoverloading;

import com.tutorsdude.methodoverloading.Example.OverloadingExample;

public class Runner {
    public static void main(String[] args) {

        int value = OverloadingExample.sub(40,30);
        System.out.println(value);

        int result = OverloadingExample.sub(40,30,20);
        System.out.println(result);

        int difference = OverloadingExample.sub(40,30,20,10);
        System.out.println(difference);

        OverloadingExample arts= new OverloadingExample();
        arts.channel(2345);

        OverloadingExample operation= new OverloadingExample();
        arts.channel("pogo");

        OverloadingExample Channel=new OverloadingExample();
        Channel.channel(1234);

        OverloadingExample Phone= new OverloadingExample();
        Phone.phone("redmi",2344);

        OverloadingExample mobile=new OverloadingExample();
        mobile.phone(43526,"vivo");
    }

}

