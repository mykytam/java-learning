package interfaceExample;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Ivan");
        animal.showInfo();
        person.showInfo();
        Info info1 = new Animal(3);
        Info info2 = new Person("Bob");
        info1.showInfo();
        info2.showInfo();
        Info info3 = new Animal(2);
        Info info4 = new Person("Mike");
        outInfo(info3);
        outInfo(info4);
        outInfo(animal);
    }
    public static void outInfo(Info info){info.showInfo(); }
}

