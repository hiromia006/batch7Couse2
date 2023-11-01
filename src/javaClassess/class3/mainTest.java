package javaClassess.class3;

public class mainTest {
    public static void main(String[] args) {
        ClassTest test = new ClassTest();
        test.name="dd";
        test.printSomething();

        Person person = new Person();
        person.name="Leemon";
        person.height=6.21f;
        person.mobileNumber="01911655246";

        person.printName();
        System.out.println(person.getMobileNumber());
        System.out.println(person.getHeight());
        person.printAddress("h4, b4, asdasd");
    }
}
