package org.bankAccount;

public class Savings extends Account {

    // List properties specific to the Saving Account
    int safetyDepositBoxId;
    int safetyDepositBoxKey;

    // Constructor to initialize settings for the Saving properties

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;

    }

    // List any methods specific to savings account
    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Saving");
    }
}
