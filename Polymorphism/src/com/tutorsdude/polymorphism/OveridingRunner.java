package com.tutorsdude.polymorphism;

import com.tutorsdude.polymorphism.Examples.*;

public class OveridingRunner {
    public static void main(String[] args) {
        MessageSender message = new MessageSender();
        message.sender();

        MessageReciever message2 = new MessageReciever();
        message2.reciever();

        ArthematicOperation operation = new ArthematicOperation();
        int optn = operation.sub(30, 20);
        System.out.println(optn);

        Substraction operation2 = new Substraction();
        int optn2 = operation2.sub(20, 20);
        System.out.println(optn2);

        Biscuits biscuit = new Biscuits();
        biscuit.biscuitType("Parle-G",10,"Parle");

        TypeOfBiscuits type=new TypeOfBiscuits();
        type.biscuitType("Sunfeast",5,"ITC");


    }

}
