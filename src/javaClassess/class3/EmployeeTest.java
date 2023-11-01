package javaClassess.class3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1=new Employee(123456789l, "Shahida");
        System.out.println(employee1.getBonus());

        Employee employee=new Employee();
        employee.designation="SQAE";
        employee.salary=987654.25;
        System.out.println(employee.getBonus());









    }
}
