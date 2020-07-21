package dz06;

public class AnimalsApp {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run(220);
        cat.swim(1);
        cat.jump(1.5);

        Dog dog = new Dog();
        dog.run(400);
        dog.swim(10);
        dog.jump(1);
    }
}

