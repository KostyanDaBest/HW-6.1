import java.util.Scanner;

public class CreditCard {
    double AcccountNumber;
    double balance;
    public void setAcccountNumber(double acccountNumber) {
        this.AcccountNumber = AcccountNumber;
        System.out.println(acccountNumber);
    }


    public void addshekel(double shekel) {
        this.balance = balance + shekel;
        System.out.println(balance);
    }

    public void sanyatShekel(double shekel) {
        if (this.balance < shekel) {
            System.out.println("Слишком мало шекелей, уходи пока ментов не вызвал!!");
        } else {
            balance = balance - shekel;
            System.out.println(balance);


        }
    }

    public void display() {
        System.out.println("Текущий баланс: " + this.balance);
        System.out.println("Номер банковской карты: " + AcccountNumber);
    }
}

