/*
package com.OOPsExample;

import java.util.Random;
import java.util.Scanner;

public class Account {
    Random rand = new Random();
    //public int avail;
    public void openAccount() {
        int acctNumber;
        String name;
        int amt;
    }

    public static int withdraw(int acct, int withdrawal) {
        int avail = avail - withdrawal;
        return avail;
    }

    public static int deposit(int acct, int deposits) {
        int avail = avail + deposits;
        return avail;
    }

    public static void main(String args[]) {
        System.out.println("Which type of account would you like to open - Choose 1 for Savings Bank Account, Choose 2 for Current Account");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        String name = "Jagriti";
        System.out.println("Enter the amount you want to deposit");
        int amt = sc.nextInt();
        final int min_amt = 1000;
        if(amt<min_amt)
        { System.out.println("minimum amt needed to open the account is 1000"); }

        int accountNum = 0;
        int balance = 0;
        int avail;

        switch (choice) {
            case 1:
                SavingsBankAccount s = new SavingsBankAccount();
                accountNum = s.openAccount(name, amt);
                avail = amt;
                System.out.println("Congratulations on opening a new Savings Bank account " + accountNum);
                break;
            case 2:
                CurrentAccount c = new CurrentAccount();
                accountNum = c.openAccount(name, amt);
                avail = amt;
                System.out.println("Congratulations on opening a new Current account " + accountNum);
                break;
        }

        System.out.println("Do you want to withdraw or deposit any amt, choose 1 for deposit and 2 for withdraw");
        switch (choice) {
            case 1:
                int deposits = sc.nextInt();
                balance = deposit(accountNum,deposits);
                System.out.println("New available balance " + balance);
                break;
            case 2:
                int withdrawal = sc.nextInt();
                balance = withdraw(accountNum,withdrawal);
                System.out.println("New available balance " + balance);
                break;
        }

    }
}
final class CurrentAccount extends Account {
    public int openAccount( String name, int amt){

        int acct = rand.nextInt(10);
        return acct;
    }
}
final class SavingsBankAccount extends Account{
    int roi =4;
    public int openAccount(String name, int amt){
        int acct = rand.nextInt(10);
        return acct;
    }

}




*/
