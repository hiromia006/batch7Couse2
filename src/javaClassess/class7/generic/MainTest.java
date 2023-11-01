package javaClassess.class7.generic;

public class MainTest {
    public static void main(String[] args) {
        StringTest stringTest = new StringTest("Welcome Test");
        System.out.println(stringTest.getString());

        IntegerTest integerTest = new IntegerTest(987);
        System.out.println(integerTest.getInteger());

        DoubleTest doubleTest = new DoubleTest(354.25);
        System.out.println(doubleTest.getaDouble());

        LongTest longTest = new LongTest(9875l);
        System.out.println(longTest.getaLong());

        System.out.println("======================================================");

        GenericTest<String> stringGenericTest = new GenericTest<>("Welcome Test");
        System.out.println(stringGenericTest.getObj());

        GenericTest<Integer> integerGenericTest = new GenericTest<>(987);
        System.out.println(integerGenericTest.getObj());

        GenericTest<Double> doubleGenericTest = new GenericTest<>(354.25);
        System.out.println(doubleGenericTest.getObj());

        GenericTest<Long> longGenericTest = new GenericTest<>(9875l);
        System.out.println(longGenericTest.getObj());

        System.out.println("======================================================");
        NumberTest<Integer> test = new NumberTest<>(987);
        System.out.println(test.getObj());

        NumberTest<Double> test1 = new NumberTest<>(354.25);
        System.out.println(test1.getObj());

        NumberTest<Long> test2 = new NumberTest<>(9875l);
        System.out.println(test2.getObj());



    }
}
