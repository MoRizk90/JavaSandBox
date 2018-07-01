package com.fox;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        FootballPlayer fox = new FootballPlayer("fox");
        BaseballPlayer Joe = new BaseballPlayer("Joe");
        SoccerPlayer Mo = new SoccerPlayer("Mo");

        Team<FootballPlayer> egyptianTeam = new Team<>("Egyptian Team");
        Team<BaseballPlayer> egyptBaseBallTeam = new Team<>("the Egy base ball team");
        egyptianTeam.addPlayer(fox);
        System.out.println("football team name " + egyptianTeam.getName());
        egyptBaseBallTeam.addPlayer(Joe);
        System.out.println("BaseBall team name " + egyptianTeam.getName());
//        egyptianTeam.addPlayer(Mo);
        System.out.println(egyptianTeam.numPlayers());
        egyptBaseBallTeam.matchResult(egyptianTeam,50,70);

    }

}
