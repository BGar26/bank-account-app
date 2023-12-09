package org.bankAccount;

public class BankAccountApp {
    public static void main(String[] args) {

        Checking chkacc1 = new Checking("Rain Wilson", "321456687", 1500);

        Savings savacc1 = new Savings("Rich Lowe", "456657897", 2500);

        savacc1.compound();

        savacc1.showInfo();
        System.out.println("--------------------------");
        chkacc1.showInfo();

    }
}