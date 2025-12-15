package fr.epita.biostats.launchers;

import fr.epita.biostats.datamodel.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("biostats/biostat(in).csv"));

        List<Person> list = new ArrayList<>();

        scanner.nextLine();
        while (scanner.hasNextLine()) {

            //Name,     Sex, Age, Height (in), Weight (lbs)
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String currentName = parts[0].trim();
            String sex = parts[1].trim();

            Integer age = Integer.valueOf(parts[2].trim());
            Integer height = Integer.valueOf(parts[3].trim());
            Integer weight = Integer.valueOf(parts[4].trim());

            Person currentCustomer = new Person(currentName, sex, age, height, weight);
            System.out.println(line);
            list.add(currentCustomer);
        }

        System.out.println(list.size());

    }
}
