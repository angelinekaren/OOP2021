package com.buatkode.learnjava;

import java.util.Scanner;

public class Driver {
    static Customer cust = new Customer();

    public static void main (String[] args) {
        Bank bank = new Bank("BCA Bank");
        Scanner s = new Scanner(System.in);
        int userChoice;
        String s1;
        System.out.printf("Welcome %s", bank.getBankName());
        System.out.println();
        do {
            System.out.println("[1] Add Customer\n [2] All customer\n [3] Get details\n [4] Deposit\n [5] Withdraw\n [6] Get NumOfCustomers\n [7] Exit");
            System.out.print(">> ");
            userChoice = s.nextInt();
            switch (userChoice) {
                case 1:
                    // Fill in the customer details and create a new customer account
                    System.out.print("Enter your first name: ");
                    String i = s.next();
                    cust.setFirstName(i);

                    System.out.print("Enter your second name: ");
                    String i2 = s.next();
                    cust.setLastName(i2);

                    System.out.print("Enter the initial balance: ");
                    double i3 = s.nextDouble();
                    cust.setAccount(new Account(i3));

                    bank.addAccount(cust);
                    break;
                case 2:
                    // Print all the customer
                    bank.printCustomerList();
                    break;
                case 3:
                    // Search customer by index, and get their details
                    System.out.println("Enter the index of customers: ");
                    int userIn2 = s.nextInt();
                    getCustomerDetails(userIn2, bank);
                    break;
                case 4:
                    // Search customer by index, and deposit
                    System.out.print("Enter the index of customers: ");
                    int userIn3 = s.nextInt();
                    getCustomerBalance(userIn3, bank);
                    System.out.print("Enter the amount you want to store: ");
                    double in = s.nextDouble();
                    bank.getCustomer(userIn3).getAccount().deposit(in);
                    getCustomerBalance(userIn3, bank);
                    break;
                case 5:
                    // Search customer by index, and withdraw
                    System.out.println("Enter the index of customers: ");
                    int userIn4 = s.nextInt();
                    getCustomerBalance(userIn4, bank);
                    System.out.print("Enter the amount you want to withdraw: ");
                    double in2 = s.nextDouble();
                    bank.getCustomer(userIn4).getAccount().withdraw(in2);
                    getCustomerBalance(userIn4, bank);
                    break;
                case 6:
                    // Get the number of customers currently stored
                    System.out.println("Number of customers: " + bank.getNumberOfCustomers());
                    break;
                case 7:
                    // Program terminated
                    System.out.println("Program terminated. Bye!");
                    java.lang.System.exit(0);
                    break;
            }
            System.out.print("Do you want to continue? (y/n): ");
            s1 = s.next().toLowerCase();
        } while (s1.equals("y"));

        System.out.println("Program terminated. Bye!");
    }

    // Function to get customer by index, and print their data details
    static void getCustomerDetails(int index, Bank customer) {
        // Getting the account from the arraylist, search by index, and print that account details
        Customer customerDetails = customer.getCustomer(index);
        System.out.println("The customer account details you're searching for:");
        System.out.println("First name: " + customerDetails.getFirstName());
        System.out.println("Last name: " + customerDetails.getLastName());
        System.out.println("Balance: $" + customerDetails.getAccount().getBalance());
    }

    // Function to get customer by index, and get their balance
    static void getCustomerBalance(int index, Bank bank) {
        Customer customerBalance = bank.getCustomer(index);
        System.out.println("Balance: $" + customerBalance.getAccount().getBalance());
    }
}
