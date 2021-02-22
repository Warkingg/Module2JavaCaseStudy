package behaviors;

import Entities.Card;
import readwritefile.fileObject;

import java.util.ArrayList;

public class CardManagement {
    ArrayList<Card> cards = new ArrayList<>();
    final String PATH ="D:\\Work\\Codegym\\Java Example Demo\\javaconsole4\\src\\card.dat";

    public void addCard(Card card){
        cards.add(card);
        fileObject.writeObjectToFile(card,PATH);
    }
    public void showAllCard(){
        for (Card card : cards){
            System.out.println(card.toString());
        }
    }
    public Card getCardById(int id) {
        Card card = new Card();
        for (Card c : cards) {
            if (c.getId() == id) {
                card = c;
            }
        }
        return card;
    }
}
