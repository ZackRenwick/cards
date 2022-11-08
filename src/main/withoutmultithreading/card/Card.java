package main.withoutmultithreading.card;

public class Card {
    private int value;
    private Suit suit;

    public Card (int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return this.getSuit().toString() + " " + Integer.toString(this.getValue());
    }

}
