package javaClassess.class4;

public class NestedIfStatement {
    public static void main(String[] args) {
        int age = 789720;
        if (age >= 18) {

            if (age >= 23) {
                System.out.println("you might got married");
            }
            System.out.println("Adult");

        } else {
            System.out.println("Child");
        }

    }
}
