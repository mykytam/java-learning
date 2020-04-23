package oop.staicExample;

public class Test {
    public static void main(String[] args) {
        int x = Math.sum(12,23); // обратились к классу без создания объекта
        System.out.println(x);
        Math a = new Math();
        System.out.println(a.x);
        a.x = 24; // смена поля без создания объекта
        System.out.println(a.x);
        Math b = new Math();
        System.out.println(b.x); // static пренадлежит классу, поле x перезаписалось для всех
    }
}
