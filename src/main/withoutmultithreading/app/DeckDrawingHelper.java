package main.withoutmultithreading.app;

import java.util.ArrayList;
import java.util.List;

import main.withoutmultithreading.card.Card;
import main.withoutmultithreading.player.Player;

public class DeckDrawingHelper {


    public void drawCard(List<Card> cards, Player player) {
        // synchronized(player) {
            Card card = cards.get(0);
            cards.remove(0);
            List<Card> playerCards = new ArrayList<>();
            playerCards.clear();
            playerCards.addAll(player.getCards());
            playerCards.add(card);
            player.setCards(playerCards);
        }
    // }
}