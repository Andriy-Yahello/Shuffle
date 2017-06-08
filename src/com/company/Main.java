package com.company;

public class Main {

    public static int[] Shuffle(int[] cards){
        int index, temp;
        for (int i = 0; i < cards.length; i++) {

            index = (int)(Math.random()*(cards.length - i)) + i;
            temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;

        }
        return cards;
    }

    public static void main(String[] args) {

        int[] cards = {8,9,12,3,7,10,32};
        for (int card:cards) {
            System.out.print(card + " ");
        }
        System.out.println();
        cards = Shuffle(cards);
        for (int card:cards) {
            System.out.print(card + " ");
        }
        //System.out.println(cards);
        // write your code here
    }
}
