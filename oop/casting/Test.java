package casting;

public class Test {
    public static void main(String[] args) {
        // Upcasting - восходящее преобразование, от наследника к родителю, рассматриваем Dog, как Animal
        Animal animal = new Dog();
        // Upcasting - восходящее преобразование, из собаки в животное
        Dog dog = new Dog();
        Animal newAnimal = dog;
        // Downcasting - нисходящее преобразование (происходит неявно) от родителя к потомку
        Dog dog2 = (Dog) newAnimal; // спустились ниже по иэрархии наследования
        dog2.bark();
        // Не сработает, нисходящее преобразование не всегда безопасно
        Animal a = new Animal();
        Dog dog3 = (Dog) a; // Java думает, что в переменной dog3 лежит объект типа Dog, но на самом деле Animal
        dog3.bark();
        // Собаку всегда можем воспринимать, как животное, но не наоборот
    }

}
