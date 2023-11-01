package javaClassess.class2;

public class TernaryOperatorTest {
    public static void main(String[] args) {
        int number1 = 150, number2 = 30, number;

        number = (number1 > number2) ? number2 : number1;
        System.out.println(number);//

        number1 = (number <= number2) ? number2 : number1;
        System.out.println(number1);//
    }
}
