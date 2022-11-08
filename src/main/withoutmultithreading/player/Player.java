package main.withoutmultithreading.player;

import java.util.ArrayList;
import java.util.List;

import main.withoutmultithreading.card.Card;

public class Player extends Thread {
    private String viewableName;
    private List<Card> cards = new ArrayList<>();

    @Override
    public void run() {
        System.out.println(this.viewableName + " has Joined");
        System.out.println(this.viewableName + " is drawing cards");
    }
       
    public Player(String name) {
        this.viewableName = name;
    } 

    public String getViewableName() {
        return viewableName;
    }


    public void setViewableName(String name) {
        this.viewableName = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
