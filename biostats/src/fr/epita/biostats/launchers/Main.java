package fr.epita.biostats.launchers;

import fr.epita.biostats.datamodel.Person;
import fr.epita.biostats.fr.epita.biostats.services.charts.ChartService;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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
        double sum = 0.0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i).getAge();
        }
        double average = sum / list.size();

        list.parallelStream()
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();

        int countM = 0;
        int countF = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSex().equals("M")) {
                countM++;
            }else if (list.get(i).getSex().equals("F")) {
                countF++;
            }
        }
        System.out.println( "count Male = " + countM);
        System.out.println( "count Female = " + countF);

        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            String key = list.get(i).getSex();
            Integer currentCount = map.get(key);
            if (currentCount == null) {
                currentCount = 1;
            } else {
                currentCount++;
            }
            map.put(key,currentCount);

        }
        System.out.println(map);


        Set<Person> set = new HashSet<>();

        set.addAll(list);
        set.addAll(list);


        System.out.println("set size :" + set.size());

        ChartService.displayCategoryChart(map, "gender distribution");
    }
}
