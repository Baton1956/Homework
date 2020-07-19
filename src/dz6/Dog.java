package dz6;

public class Dog extends Animal {
    private final int MAX_RUN = 500;
    private final int MAX_SWIM= 10;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN))
            System.out.println("Собака  пробежала 500 метров");
        else
            System.out.println("run: false");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM))
            System.out.println("Собака проплыла 10 метров");
        else
            System.out.println("swim: false");
    }
    @Override
    public void voice() {
        System.out.println("Cобака залаяла");

    }

    }