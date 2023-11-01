package javaClassess.class2;

public class UnaryOperatorTest {
    public static void main(String[] args) {
        // ++exp, exp++, --exp, exp--

        int number = 70;
        System.out.println(number++);//70, 70+1
        System.out.println(++number); //71 +1=72
        System.out.println(number); //71+1=72
        System.out.println(--number); // 72, 72-1=71
        System.out.println(number--); //71, 71-1=70
        System.out.println(number); //70

        number=25+30;
        System.out.println(--number); // 55-1=54
        System.out.println(number--); //54, 54-1=53
        System.out.println(number++);//53, 53+1=54
        System.out.println(++number); //54+1=55
        System.out.println(number); //54+1=55


    }
}
