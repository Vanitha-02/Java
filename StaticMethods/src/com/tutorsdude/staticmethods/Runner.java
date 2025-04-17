package com.tutorsdude.staticmethods;

import com.tutorsdude.staticmethods.examplemethods.CricketTeam;
import com.tutorsdude.staticmethods.examplemethods.FootBall;
import com.tutorsdude.staticmethods.examplemethods.Players;

public class Runner {
    public static void main(String[] args) {
        Players.elevenPlayers();
        Players.Qualification();

        CricketTeam team = new CricketTeam();
        team.cricketPlayers();

        FootBall footBall = new FootBall();
        footBall.footBallPlayers();

    }
}
