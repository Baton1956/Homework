package dz06;

class Cat extends Animal {

    private final int MAX_RUN_LENGTH = 200;
    private final double MAX_JUMP_HEIGTH = 2;
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH))
            System.out.println("Кот пробежал 200 метров");
        else
            System.out.println("run: false");
    }

    @Override
    void swim(int length) {

        System.out.println("Кот не умеет плавать");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= MAX_JUMP_HEIGTH))
            System.out.println("Кот прыгнул на 2 метра");
        else
            System.out.println("jump: fase");
    }
}
