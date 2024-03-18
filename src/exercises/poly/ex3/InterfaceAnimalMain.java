package exercises.poly.ex3;

public class InterfaceAnimalMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Duck duck = new Duck();
        Cat cat = new Cat();

        dog.sound();
        dog.move();

        duck.sound();
        duck.move();

        cat.sound();
        cat.move();



    }
}
