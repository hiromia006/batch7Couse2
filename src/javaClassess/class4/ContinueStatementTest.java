package javaClassess.class4;

public class ContinueStatementTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i >= 5) continue;
            System.out.println("continue " + i);
        }
    }
}
