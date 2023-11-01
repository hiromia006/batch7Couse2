package javaClassess.class8;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Wasid");
        strings.add("Zaim");
        strings.add("Leemon");
        strings.add("Shahida");

        strings.add(1, "Rishad");

        strings.add("Fahmida");
        strings.add("Shahida");
        strings.remove(2);

        List<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("Jack");

        strings.addAll(fruits);

        for (String str : strings) {
            System.out.println(str);
        }
        System.out.println("================================");

        strings.removeAll(fruits);
        for (String str : strings) {
            System.out.println(str);
        }

    }
}
