package javaClassess.class3;

public class Person {
    String name;
    float height;
    String mobileNumber;

    public Person() {

    }

    public void printName() {
        System.out.println("Your name is " + name);
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void printAddress(String address) {
        System.out.println("your address : " + address);
    }

    public float getHeight() {
        return height;
    }
}
