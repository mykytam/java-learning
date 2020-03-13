package abstractExample;

public class Dog extends Animal {
    @Override
    public void makeSound() { // обязаны реализовать метод, ведь он есть в абстрактом классе, который наследуем
        System.out.println("bark");
    }
}