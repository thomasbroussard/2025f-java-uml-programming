package fr.epita.bank.launcher;

import fr.epita.bank.datamodel.Customer;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Customer customer = new Customer();
        customer.setName("John");
        customer.setAddress("Paris");


    }
}
