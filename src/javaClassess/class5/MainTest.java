package javaClassess.class5;

public class MainTest {
    public static void main(String[] args) {
        System.out.println(VariablesTest.salary);
        VariablesTest.printSomeThing();

        VariablesTest test = new VariablesTest();
        System.out.println(test.name);
        test.printNumber();
    }
}
