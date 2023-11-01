package javaClassess.class7;

public interface Drawable {
     int SALARY = 5000;

    void draw();

    default void printMsg() {
        System.out.println("default method");
        printSomeThing();
    }

    static int cube(int x) {
        return x * x * x;
    }

    private void printSomeThing() {
        System.out.println("It is private method");
    }
}
