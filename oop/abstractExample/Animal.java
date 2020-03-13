package abstractExample;

public abstract class Animal { // не сущность, концепция
    public void eat() {
        System.out.println("ama eat"); // все животные едят одинаково
    }
    public abstract void makeSound(); // но все издают разные звуки (обязательно реализовать в наследниках)
}