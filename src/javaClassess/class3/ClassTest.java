package javaClassess.class3;

public class ClassTest {
    String name;


    public void printSomething() {
        System.out.println("Some Things");
    }

    public static void main(String[] args) {
        ClassTest test = new ClassTest();
        test.name = "Class";
        test.printSomething();
    }
}
