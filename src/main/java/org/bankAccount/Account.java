package org.bankAccount;

public  class Account implements IBaseRate {

    // List common properties for savings and checking accounts
    String name;
    String sSN;
    double balance;
    String accountNumber;
    static int index = 10000;
    double rate;

    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;


        // Set account number
        index++;
        this.accountNumber = setAccountNumber();

        setRate();
    }

    public void setRate() {

    }

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length() - 4);
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    // List common methods
    public void showInfo() {
        System.out.println(
                "NAME: " + name +
                        "\nACCOUNT NUMBER: " + accountNumber +
                        "\nBALANCE: " + balance +
                        "\nRATE: " + rate + "%"
        );
    }
}
