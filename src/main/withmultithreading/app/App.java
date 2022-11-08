package main.withmultithreading.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.withmultithreading.card.Card;
import main.withmultithreading.card.FaceCards;
import main.withmultithreading.card.Suit;
import main.withmultithreading.player.Player;

public class App {

    public static void main(String[] args) throws Exception {
            
        List<Card> shuffledCards = getShuffledCards();

        for(Card card: shuffledCards) {
            System.out.println(card);
        }
        
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Player player3 = new Player("Player 3");
        Player player4 = new Player("Player 4"); 


        System.out.println("Player1");
        System.out.println();
        System.out.println(player1.getCards().size());
        for (Card card: player1.getCards() ) {
            System.out.println(card);
        }
        System.out.println("Player2");
        System.out.println();
        System.out.println(player2.getCards().size());
        for (Card card: player2.getCards() ) {
            System.out.println(card);
        }
        System.out.println("Player3");
        System.out.println();
        System.out.println(player3.getCards().size());
        for (Card card: player3.getCards() ) {
            System.out.println(card);
        }
        System.out.println("Player4");
        System.out.println();
        System.out.println(player4.getCards().size());
        for (Card card: player4.getCards() ) {
            System.out.println(card);
        }
           
    }   

    private static List<Card> getShuffledCards() {
        List<Card> cards = new ArrayList<>();
        initialiseDeck(cards);
        shuffleDeck(cards);
        return cards;
    }

    private static void shuffleDeck(List<Card> cards) {
        Collections.shuffle(cards);
    }

    private static void initialiseDeck(List<Card> cards) {
        for (Suit suit: Suit.values()) {
            for(int i = 1 ;i<=10 ; i++) {
                Card card = new Card(i, suit);
                cards.add(card);
            }
            for (FaceCards faceCard : FaceCards.values()) {
                Card card = new Card(faceCard.getValue(), suit);
                cards.add(card);
            }
        }
    }
}