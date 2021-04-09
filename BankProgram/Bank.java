package com.buatkode.learnjava;


public class Bank {
    private java.util.ArrayList<Customer> customers = new java.util.ArrayList<>();
    private int numberOfCustomers = 0;
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    // Function to add new customer account
    public void addAccount(Customer customer) {
        if (customer.equals("")&& customer==null) {
            System.out.println("There is no customers stored yet");
        }
        else {
            customers.add(new Customer(customer.getFirstName(), customer.getLastName(), customer.getAccount()));
            numberOfCustomers += 1;
        }
    }

    // Function to get the number of customers stored
    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    // Function to get all the customer
    public void printCustomerList(){
        if (customers.isEmpty()){
            System.out.println("empty.");
        } else {
            for(int i=0; i<customers.size(); i++){
                System.out.print("Index: " + i + "; ");
                System.out.print("First name: " + customers.get(i).getFirstName() + "; ");
                System.out.print("Last name: " + customers.get(i).getLastName() + "; ");
                System.out.print("Balance: $" + customers.get(i).getAccount().getBalance() + "; ");
                System.out.println();
            }
        }
    }

    // Function to get customer by index
    public Customer getCustomer(int index) {
        return customers.get(index);
    }



}
