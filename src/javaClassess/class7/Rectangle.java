package javaClassess.class7;

public class Rectangle implements Drawable, Bank, BangladeshBank {
    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }

    @Override
    public double getInterestRate() {
        return 0;
    }
}
