package com.tutorsdude.staticblock;

public class SportsTeam {
    public String name;
    public static int players;
    public int age;

    static {
        players = 11;
        System.out.println(players);
    }
    public static void main(String[] args) {
        SportsTeam.players = 11;
        SportsTeam team = new SportsTeam("RCB", 20);
        team.name = "RCB";
        System.out.println(team.name);
        team.age = 20;
        System.out.println(team.age);

    }
    SportsTeam(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
