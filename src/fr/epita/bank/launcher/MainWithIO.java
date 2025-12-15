package fr.epita.bank.launcher;

import fr.epita.bank.datamodel.Customer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class MainWithIO {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to the Bank Account System");

        System.out.println("Customer Creation, write a name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        Customer customer = new Customer();
        customer.setName(name);

        Scanner fileInput =new Scanner(new File("demo.csv"));
        fileInput.nextLine();

        List<Customer> list = new ArrayList<>();


        while (fileInput.hasNextLine()) {
            String line = fileInput.nextLine();
            String[] parts = line.split(";");
            String currentName = parts[0];
            String address = parts[1];
            Customer currentCustomer = new Customer();
            currentCustomer.setName(currentName);
            currentCustomer.setAddress(address);
            System.out.println(line);
            list.add(currentCustomer);
        }

        System.out.println(list.size());
        fileInput.close();


        input.close();
    }
}
