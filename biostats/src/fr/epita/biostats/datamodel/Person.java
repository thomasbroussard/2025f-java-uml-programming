package fr.epita.biostats.datamodel;

import java.util.Objects;

public class Person {
 //Name,     Sex, Age, Height (in), Weight (lbs)
    private String name;
    private String sex;
    private Integer age;
    private Integer height;
    private Integer weight;


    public Person(String name, String sex, Integer age, Integer height, Integer weight) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(sex, person.sex) && Objects.equals(age, person.age) && Objects.equals(height, person.height) && Objects.equals(weight, person.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, height, weight);
    }
}
