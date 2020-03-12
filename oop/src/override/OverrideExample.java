package override;

class Parent {
    int method() { // static не переопределяется
        // если static, то будет выполнен этот же метод, выведется 1
        return 1;
    }
}

class Child extends Parent {
    @Override
    final int method() {
        // при переопределении можно только расширять
        // при переопределении метода нельзя сузить модификатор доступа к методу
        return 2;
    }
}


public class OverrideExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();

        System.out.println(parent.method());
        System.out.println(child.method());
    }
}
