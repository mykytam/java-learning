package oop.interfaceExample;

public class Animal implements Info{
    public int id;
    public void sleep() { System.out.println("I'm sleeping"); }
    public Animal(int id) {  this.id = id; }
    @Override
    public void showInfo() { System.out.println("id is " + this.id); }
}