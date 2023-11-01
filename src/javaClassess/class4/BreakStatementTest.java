package javaClassess.class4;

public class BreakStatementTest {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if (i > 5) break;
            System.out.println("break " + i);
        }

        for (int i = 0; i < 100; i += 20) {
            System.out.println("break " + i);
            if (i <= 25) break;

        }
    }
}
