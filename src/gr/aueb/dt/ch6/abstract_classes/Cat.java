package gr.aueb.dt.ch6.abstract_classes;

public class Cat extends Animal {


    @Override
    public void speak() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Cat is eating");
    }
}
