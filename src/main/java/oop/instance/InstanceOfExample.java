package oop.instance;

public class InstanceOfExample {
    public static void main(String[] args) {
        // Оператор instanceof возвращает true, если объект является экземпляром класса или его потомком.
        String s = "Hello";
        int i = 1;
        String g;

        if (s instanceof java.lang.String) {
            // попадем сюда, т.к. выражение будет true
            System.out.println("s is a String");
        }

        System.out.println(Integer.class.isInstance(1));

//        if (g instanceof java.lang.String) {
//            // g не инициализирована и поэтому сюда мы не попадем, т.к.
//            // g - null и instanceof вернет false для null.
//            System.out.println("g is a String");
//        }
    }
}
