package javaClassess.class2;

public class ArithmeticOperatorTest {
    public static void main(String[] args) {
        int number1 = 1000, number2 = 20, number;

        number = number1 - number2;
        System.out.println(number);//980

        number = number - number2;
        System.out.println(number); //960

        number = number / number2;
        System.out.println(number); //48

        number = number1 * number2;
        System.out.println(number); //20000

         //20001 % 20 = 1
        number = ++number % number2--;
        System.out.println(number); //1

        // (1-1=0*1000)
        number=--number*number1;
        System.out.println(number);//0
    }
}
