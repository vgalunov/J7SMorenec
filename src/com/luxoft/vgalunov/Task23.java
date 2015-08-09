package com.luxoft.vgalunov;

/**
 * Task23. Suits of playing cards are assigned serial numbers: 1 - spades, 2 -
 * clubs, 3 - diamonds, 4 - hearts. The cards higher of ten numbered 11 - Jack,
 * 12 - Queen, 13 - King, 14 - Ace. Given two integers: N - the dignity of (6 ≤
 * N ≤ 14) and M - suit cards (1 ≤ M ≤ 4). Print the name of the appropriate
 * card type "six of diamonds", "Queen of Hearts", "ace of clubs" and so on.
 *
 * @author vgalunov
 */
public class Task23 {

    public static void main(String[] args) {
        int n = 12;
        int m = 3;
        String cardsuit = "";
        switch (m) {
            case Suit.SUIT_SPADES.getSuiet():
                cardsuit = "of spades";
                break;
            case Suit.SUIT_CLUBS.getSuit():
                cardsuit = "of clubs";
                break;
            case Suit.SUIT_DIAMONDS.getSuit():
                cardsuit = "of diamonds";
                break;
            case Suit.SUIT_HEARTS.getSuit():
                cardsuit = "of hearts";
                break;

        }
        System.out.println(cardsuit);

    }

    enum Suit {

        SUIT_SPADES(1), SUIT_CLUBS(2), SUIT_DIAMONDS(3), SUIT_HEARTS(4);
        private int numb = 0;

        Suit(int numb) {
            this.numb = numb;
        }
        public int getSuit() {
            return numb;
        }
    }

    enum Card {

        six, seven, eight, nine, ten, Jack, Queen, King, Ace
    }
}
