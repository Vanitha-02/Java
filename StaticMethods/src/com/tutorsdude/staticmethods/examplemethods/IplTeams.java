package com.tutorsdude.staticmethods.examplemethods;

public class IplTeams {
    public String name;
    public static int players;
    public int age;


    static {
        players=11;
    }

    public static void main(String[] args) {
        IplTeams.players = 11;
        System.out.println(IplTeams.players);
        IplTeams team = new IplTeams("RCB", 20);
        System.out.println(team.name);
        System.out.println(team.age);
    }


    IplTeams(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
