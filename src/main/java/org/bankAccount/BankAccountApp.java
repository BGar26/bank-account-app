package org.bankAccount;

import org.bankAccount.utlities.CSV;

import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        String file = "C:\\Project files\\NewBankAccounts.csv\\";

        // Read a CSV File then create new accounts based onthat data
        List<String[]> newAccountHolder = CSV.read(file);
        for(String[] accountHolder : newAccountHolder) {
            System.out.println("NEW ACCOUNT");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);

        }
    }
}