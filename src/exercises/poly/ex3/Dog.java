package exercises.poly.ex3;

import exercises.poly.ex2.AbstractAnimal;

public class Dog implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {

    }
}
