package interfaceExample;

public class Person implements Info{
    public String name;
    public void sayHello(){ System.out.println("hello"); }
    public Person(String name) { this.name = name; }
    @Override
    public void showInfo() { System.out.println("name is " + this.name); }
}