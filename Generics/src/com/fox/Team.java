package com.fox;

import java.util.ArrayList;

public class Team<T extends Player> { // by adding a T we made the class generic
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println("the player : " + player.getName() + " already exists");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " Is added sucessufly");
            return true;
        }

    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore){
        String message;
        if (ourScore > theirScore ){
            won++;
            message = " defet ";
        } else if(ourScore == theirScore){
            tied++;
            message = " drawed with ";
        }else{
            lost++;
            message = " lost in front of";
        }

        played++;
        if (opponent != null){
            System.out.println(this.getName() +" " + message + " " + opponent.getName());
            opponent.matchResult(null,theirScore,ourScore);

        }

    }

    public int ranking(){
        return won*2 + tied;
    }
}
