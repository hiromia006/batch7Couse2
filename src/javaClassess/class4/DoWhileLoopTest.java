package javaClassess.class4;

public class DoWhileLoopTest {
    public static void main(String[] args) {

        // Java for loop: for(initialization, condition, increment/decrement)
        int i = 0;
        while (i <= 9) {
            System.out.println(i);
            i++;
        }

        System.out.println("==============================");
        int j = 0;
        do {
            System.out.println(j);//10,10, 0
            j++;
        } while (j <= 9);
    }
}
