package com.tutorsdude.aggregate1;

import com.tutorsdude.aggregate1.Example.*;


public class Runner {
    public static void main(String[] args){

        Computer comp=new Computer();
        comp.brand="Dell";
        System.out.println(comp.brand);

        Monitor mtr= new Monitor();
        mtr.brand="Dell";
        mtr.price=3000;

        Display disp=new Display();
        disp.brand="dell";
        disp.resolution="medium";


        mtr.printAll();
        disp.printAll();

        Keyboard key=new Keyboard();
        key.brand="dell";
        key.price=2000;
        key.noOfKeys=128;

        key.printAll();

        Ram ram=new Ram();
        ram.storage=128;
        ram.price=500;

        Ram ram1=new Ram();
        ram1.storage=250;
        ram1.price=1000;

        Ram ram2=new Ram();
        ram2.storage=250;
        ram2.price=1500;

        Ram[] ram4Array={ram,ram1,ram2};
        comp.ram=ram4Array;

        for(int i = 0;i < ram4Array.length;i++){
            ram4Array[i].printAll();
        }

        Speaker speek=new Speaker();
        speek.brand="dell";
        speek.price=50000;
        speek.qualityType="Good";

        Speaker speek1=new Speaker();
        speek1.brand="dell";
        speek1.price=50000;
        speek1.qualityType="Good";

        Speaker speek2=new Speaker();
        speek2.brand="dell";
        speek2.price=50000;
        speek2.qualityType="Good";

        Speaker[] speekArray={speek,speek1,speek2};
        comp.speaker=speekArray;

        for(int j = 0;j < speekArray.length;j++){
            speekArray[j].printAll();
        }
    }
}
