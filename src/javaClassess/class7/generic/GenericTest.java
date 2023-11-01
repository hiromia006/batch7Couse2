package javaClassess.class7.generic;

public class GenericTest<T> {
    private T obj;

    public GenericTest(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
