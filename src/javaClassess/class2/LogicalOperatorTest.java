package javaClassess.class2;

public class LogicalOperatorTest {
    public static void main(String[] args) {

        // && ||
        int number1 = 987, number2 = 321, number3;

        number3 = number1 - number2; //987-321=666
        System.out.println(number3 > number1); // false

        number1 = number3 - number1; //666-987= −321
        System.out.println(number3 < number1); // false
        //number1=-321, number2=321, number3=666

        number2 = number1 - number3; //-321-666=−987
        //number1=-321, number2=−987, number3=666
        System.out.println(number2 >= number1); //false
        System.out.println("===========================================");
        System.out.println( (number1 > number2) && (number2 > number3));//false
        System.out.println( (number1 > number2) && (number2 < number3));// true
        System.out.println( (number1 > number2) || (number2 > number3)); // true
    }
}
