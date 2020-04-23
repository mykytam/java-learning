package oop.overload;

import java.io.IOException;

public class Overload {
    public static int addTwoDigits(int a, int b) throws IOException {
        return a + b;
    }
    protected final double addTwoDigits(double a, double b) throws Exception{
        return a +b ;
    }
    double addTwoDigits() {
        return 5 ;
    }

    public static void main(String[] args) throws Exception {
        OverloadChild overload = new OverloadChild();
        System.out.println(overload.addTwoDigits(5,6));
        System.out.println(overload.addTwoDigits(2.4,7.9));
        System.out.println(overload.addTwoDigits());
        overload.addTwoDigits(5);
    }
}

class OverloadChild extends Overload{
    void addTwoDigits(int i) {
        System.out.println("overload");
    }

}