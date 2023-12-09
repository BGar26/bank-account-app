package org.bankAccount;

public class Savings extends Account {

    // List properties specific to the Saving Account
    int safetyDepositBoxId;
    int safetyDepositBoxKey;
    // Constructor to initialize settings for the Saving properties

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN,initDeposit);
        System.out.print("New Savings Account");
    }

    // List any methods specific to savings account

}
