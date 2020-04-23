package oop.staticInnerClass;


public class ElectroCar {
    private int id;

    // нестатический вложеный класс, нужен когда объект класса сложный и его можно разделить на подобъекты
    private class Motor {
        public void startMotor() {
            System.out.println("motor" + id + "is starting");
        }
    }

    // статический вложенный класс, нужны для использования из вне, поэтому часто public
    // не имеет доступа к другим полям, потому что они не static
    public static class Battery {
        public void charge() {
            System.out.println("battery is charging");
        }
    }

    public ElectroCar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();

        final int x = 1;

        // вложенный класс внутри метода
        // имеет доступ и к id и к x (только к константам)
        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someObject = new SomeClass();
        test(someObject);
        System.out.println("electrocar " + id + " is starting");
    }

    private void test(Object obj) {
    }
}