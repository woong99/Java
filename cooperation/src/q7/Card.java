package q7;

public class Card {
    private static int num = 1000;
    private int cardNum;

    public Card() {
        cardNum = num;
        num++;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNum=" + cardNum +
                '}';
    }
}
