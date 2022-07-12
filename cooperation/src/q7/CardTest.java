package q7;

public class CardTest {
    public static void main(String[] args) {
        CardCompany cardCompany = CardCompany.getInstance();
        Card card1 = cardCompany.createCard();
        Card card2 = cardCompany.createCard();
        System.out.println(card1.toString());
        System.out.println(card2.toString());
    }
}
