package javaClassess.class5;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Wasid", 23);
        System.out.println(person.getAge());
        System.out.println(person.getName());
        person.eat();
        person.speak();
    }
}
