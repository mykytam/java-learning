package oop.staicExample;

public class Math {
   public static  int x = 12;

    public static int sum(int a, int b) {
        // mult(7, 6); // в статическом методе нельзя пользоваться нестатическими методами
        return a + b;
    }
    public int mult(int a, int b) {
        return a * b;
    }
}
