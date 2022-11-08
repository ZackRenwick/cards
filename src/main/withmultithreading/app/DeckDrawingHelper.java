package main.withmultithreading.app;

import java.util.ArrayList;
import java.util.List;

import main.withmultithreading.card.Card;
import main.withmultithreading.player.Player;

public class DeckDrawingHelper {

    public void drawCard(Player player, List<Card> cards) {
        synchronized(player) {
            while(cards.size() > 0) {
                Card card = cards.get(0);
                cards.remove(0);
                List<Card> playerCards = new ArrayList<>();
                playerCards.clear();
                playerCards.addAll(player.getCards());
                playerCards.add(card);
                player.setCards(playerCards);
                
                Thread.currentThread().interrupt();
                
            }
        }
        Thread.currentThread().notify();
    }
}