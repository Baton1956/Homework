package dz6;




        public class Cat extends Animal {
            private final int MAX_RUN = 200;
            @Override
            void voice() {
                System.out.println("Кот мяукнул");
            }


            @Override
            void run(int length) {
                if ((length >= 0) && (length <= MAX_RUN))
                    System.out.println("Кот пробежал 200 метров");
                else
                    System.out.println("run: false");
            }

            @Override
            void swim(int length) {

                System.out.println("Кот не умеет плавать");
            }


        }