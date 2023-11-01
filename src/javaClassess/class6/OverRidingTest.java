package javaClassess.class6;

public class OverRidingTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();


        BracBank bracBank = new BracBank();
        System.out.println(bracBank.getInterestRate());
        bracBank.printReservedDollar();
        bracBank.printDpsRate();


         BangladeshBank bank = new BracBank();
        System.out.println(bank.getInterestRate());

    }
}
