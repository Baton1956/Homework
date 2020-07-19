package dz06;


    class Dog extends Animal{
        private final int MAX_RUN_LENGTH = 500;
        private final int MAX_SWIM_LENGTH = 10;
        private final double MAX_JUMP_HEIGTH = 0.5;

        @Override
        void run(int length) {
            if ((length >= 0) && (length <= MAX_RUN_LENGTH))
                System.out.println("Дог пробежал 500 метров");
        }

        @Override
        void swim(int length) {
            if ((length >= 0) && (length <= MAX_SWIM_LENGTH))
                System.out.println("Дог проплыл 10 метров");
            else
                System.out.println("swim: false");
        }

        @Override
        void jump(double height) {
            if ((height >= 0) && (height <= MAX_JUMP_HEIGTH))
                System.out.println("Дог прыгнул 0,5 метра");
            else
                System.out.println("jump: false");
        }


    }

