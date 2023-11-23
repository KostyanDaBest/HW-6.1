import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard();
        CreditCard creditCard2 = new CreditCard();
        CreditCard creditCard3 = new CreditCard();
        creditCard2.setAcccountNumber(16990300);
        creditCard1.setAcccountNumber(120493915);
        creditCard3.setAcccountNumber(77777777);
        creditCard2.addshekel(3752);
        creditCard3.addshekel(2465);
        creditCard1.addshekel(136878);
        creditCard1.display();
        creditCard2.display();
        creditCard3.display();
        }

    }
