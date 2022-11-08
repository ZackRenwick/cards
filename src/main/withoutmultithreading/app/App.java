package main.withoutmultithreading.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.withoutmultithreading.card.Card;
import main.withoutmultithreading.card.FaceCards;
import main.withoutmultithreading.card.Suit;
import main.withoutmultithreading.player.Player;

public class App {

    public static void main(String[] args) throws Exception {
        List<Card> cards = getShuffledCards();
            
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Player player3 = new Player("Player 3");
        Player player4 = new Player("Player 4"); 

        drawCards(cards, player1, player2, player3, player4);

        int player1Score = 0;
        int player2Score = 0;
        int player3Score = 0;
        int player4Score = 0;
        System.out.println("Player1");
        System.out.println();
        System.out.println(player1.getCards().size());
        for (Card card: player1.getCards() ) {
            System.out.println(card);
            player1Score += card.getValue();
        }
        System.out.println("Player2");
        System.out.println();
        System.out.println(player2.getCards().size());
        for (Card card: player2.getCards() ) {
            System.out.println(card);
            player2Score += card.getValue();
        }
        System.out.println("Player3");
        System.out.println();
        System.out.println(player3.getCards().size());
        for (Card card: player3.getCards() ) {
            System.out.println(card);
            player3Score += card.getValue();
        }
        System.out.println("Player4");
        System.out.println();
        System.out.println(player4.getCards().size());
        for (Card card: player4.getCards() ) {
            System.out.println(card);
            player4Score += card.getValue();
        }
        System.out.println("Player1 Score: " + player1Score);
        System.out.println("Player2 Score: " + player2Score);
        System.out.println("Player3 Score: " + player3Score);
        System.out.println("Player4 Score: " + player4Score);

           
    }
          
    private static void drawCards(List<Card> cards, Player... players) {
        DeckDrawingHelper deckDrawingHelper = getDeckDrawingHelper();
        while (!cards.isEmpty()) {
            for (Player player : players) {
                deckDrawingHelper.drawCard(cards, player);
            }
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

    private static DeckDrawingHelper getDeckDrawingHelper() {
        DeckDrawingHelper deckDrawingHelper = new DeckDrawingHelper();
        return deckDrawingHelper;
    }
}
             