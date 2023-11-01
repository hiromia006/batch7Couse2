package javaClassess.class8;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Double> numbers=new HashSet<>();
        numbers.add(98.21);
        numbers.add(75.00);
        numbers.add(65.50);

//        for (Double aDouble:numbers){
//            System.out.println(aDouble);
//        }

        numbers.add(10.25);
        numbers.remove(98.21);
        numbers.add(75.00);


        Set<Double> numbers2=new HashSet<>();
        numbers2.add(98.21);
        numbers2.add(75.00);
        numbers2.add(65.50);

        numbers.addAll(numbers2);

        System.out.println("=========================");
        for (Double aDouble:numbers){
            System.out.println(aDouble);
        }


    }
}
