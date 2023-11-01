package javaClassess.class3;

public class Employee {
    private long id;
    private String name;
    String designation;
    double salary;

    public Employee() {

    }

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public double getBonus() {
        return salary * .50;
    }
}
