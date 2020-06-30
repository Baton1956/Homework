package dz01;

/*  ДЗ 01 Абрамов А. */

    //1.	Создать пустой проект в IntelliJ IDEA и прописать метод main().
public class FirstHomeWork {
    public static void main(String[] args) {
    }
    //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    static void doOne() {

        boolean b = false;
        byte bt = 2;
        char c = 'A';
        short s = 123;
        int i = 567;
        long l = 67896L;
        float f = 777.7f;
        double d = 777.777;
        System.out.println("Значение для типа boolean = " + b);
        System.out.println("Значение для типа byte = " + bt);
        System.out.println("Значение для типа char = [" + c + "]");
        System.out.println("Значение для типа short = " + s);
        System.out.println("Значение для типа int = " + i);
        System.out.println("Значение для типа long = " + l);
        System.out.println("Значение для типа float = " + f);
        System.out.println("Значение для типа double = " + d);
    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – входные параметры этого метода, имеющие тип float.
    public static float thrid (float a, float b, float c, float d) {

        return a * (b + (c / d));
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
    //в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    static boolean doThree(int a, int b) {

        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен
    //напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
    //считаем положительным числом.
    static void doFour(int a) {

        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    //6. Написать метод, которому в качестве параметра передается целое число, метод должен
    //вернуть true, если число отрицательное;
    static boolean doFive(int a) {

        if (a < 0) return true;
        return false;
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    //метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    static void doSix(String name) {

        System.out.println("Привет, " + name + "!");
    }
}