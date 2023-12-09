package org.bankAccount;

public class Checking extends Account {

    // List properties specific to a Checking account
    int debitCardNumber;
    int debitCardPin;

    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    // List any methods specific to the checking account
    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
        System.out.println("CARD:" + this.debitCardNumber);
        System.out.println("PIN:" + this.debitCardPin);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account Features" +
                "\nDebit Card Number: " + debitCardNumber +
                "\nDebit Card PIN: " + debitCardPin
                );
    }
}
