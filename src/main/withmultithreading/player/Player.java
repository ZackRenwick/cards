package main.withmultithreading.player;

import java.util.ArrayList;
import java.util.List;

import main.withmultithreading.card.Card;

public class Player {

    private String viewableName;
    private List<Card> cards = new ArrayList<>();

    
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
