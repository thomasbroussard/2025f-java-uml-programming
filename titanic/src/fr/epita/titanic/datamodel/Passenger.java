package fr.epita.titanic.datamodel;

public class Passenger {
    private String name;
    private String pclass;
    private double age;
    private String gender;
    private boolean survived;

    public Passenger(String name, String pclass, double age, String gender, boolean survived) {
        this.name = name;
        this.pclass = pclass;
        this.age = age;
        this.gender = gender;
        this.survived = survived;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPclass() {
        return pclass;
    }

    public void setPclass(String pclass) {
        this.pclass = pclass;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isSurvived() {
        return survived;
    }

    public void setSurvived(boolean survived) {
        this.survived = survived;
    }
}
