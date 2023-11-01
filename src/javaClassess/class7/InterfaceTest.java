package javaClassess.class7;

public class InterfaceTest {
    public static void main(String[] args) {
        BracBank bank = new BracBank();
        System.out.println("Print interest rate is " + bank.getInterestRate());

        System.out.println(Drawable.cube(5));
        System.out.println(Drawable.SALARY);

        Rectangle rectangle = new Rectangle();
       rectangle.draw();
       rectangle.printMsg();


    }
}
