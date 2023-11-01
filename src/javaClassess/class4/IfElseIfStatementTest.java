package javaClassess.class4;

public class IfElseIfStatementTest {
    public static void main(String[] args) {
        int mark = 85;

        if (mark >= 80 && mark <= 100) {
            System.out.println("A++");
        } else if (mark >= 70 && mark <= 79) {
            System.out.println("A");
        } else if (mark >= 60 && mark <= 69) {
            System.out.println("B");
        } else if (mark >= 40 && mark < 60) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }
    }
}
