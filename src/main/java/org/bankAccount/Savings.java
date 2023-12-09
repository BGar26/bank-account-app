package org.bankAccount;

public class Savings extends Account {

    // List properties specific to the Saving Account
    int safetyDepositBoxId;
    int safetyDepositBoxKey;

    // Constructor to initialize settings for the Saving properties

    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
        System.out.println(safetyDepositBoxId);
    }

    // List any methods specific to savings account
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Saving");
        super.showInfo();
        System.out.println(
                "Your Savings Account Features" +
                        "\n Safety Deposit Box ID: " + safetyDepositBoxId +
                        "\n Safety Deposit Box Key: " + safetyDepositBoxKey
        );

    }


}
