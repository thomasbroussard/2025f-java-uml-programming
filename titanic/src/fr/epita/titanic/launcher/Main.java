package fr.epita.titanic.launcher;

import fr.epita.titanic.datamodel.Passenger;
import fr.epita.titanic.services.ChartService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("titanic/titanic-train.csv"));

        List<Passenger> list = new ArrayList<>();


        scanner.nextLine();
        while (scanner.hasNextLine()) {

            //Name,     Sex, Age, Height (in), Weight (lbs)
            String line = scanner.nextLine();
            String[] parts = line.split(";");
            String currentName = parts[0].trim();
            String pclass = parts[1].trim();

            String rawAge = parts[2].trim();
            if (rawAge.equals("")) {
                continue;
            }
            Double age = Double.valueOf(rawAge);
            String gender = parts[3].trim();
            Boolean survived = Boolean.valueOf(parts[4].trim());

            Passenger currentCustomer = new Passenger(currentName, pclass, age, gender,survived);
            System.out.println(line);
            list.add(currentCustomer);
        }

        System.out.println(list.size());

        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Passenger::getPclass, Collectors.counting()));

        System.out.println(collect);

        ChartService.displayCategoryChart(collect, "passenger class distribution");

    }
}
