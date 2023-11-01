package javaClassess.class2;

public class AssignmentOperatorTest {
    public static void main(String[] args) {
        //Assignment Operator: = += -= *= /= %=
        int number1 = 150, number2 = 30;

        number1 += number2; // number1=number1+  number2 //number1=150+30=180;
        System.out.println(number1); //180

        number1 -= number2;//number1=number1-number2;
        System.out.println(number1); //150

        number2 *= number1; //
        System.out.println(number2); //4500

        number2/=number1;
        System.out.println(number2);//30

        number1%=number2; // number1=number1%number2=150%30=0
        System.out.println(number1); //0

    }
}
