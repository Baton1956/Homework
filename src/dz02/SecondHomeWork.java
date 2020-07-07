package dz02;

/*  ДЗ 02 Абрамов А. */

public class SecondHomeWork {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        changeArray();
        System.out.println("\n\nTask 2:");
        createArray();
        System.out.println("\n\nTask 3:");
        changeArray2();
        System.out.println("\n\nTask 4:");
        createArray2();
        System.out.println("\nTask 5:");
        findMininalAndMaximalElementOfArray();

    }

    /**
     * Task 1	Задать целочисленный массив, состоящий из элементов 0 и 1.
     *  Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     *  С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    static void changeArray() {
        int[] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.print("  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Task 2	Задать пустой целочисленный массив размером 8.
     *  С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    static void createArray() {
        int[] arr = new int[8];

        for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Task 3  Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     *  и числа меньшие 6 умножить на 2;
     */
    static void changeArray2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};


        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("\n ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Task 4	Создать квадратный двумерный целочисленный массив
     * (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    static void createArray2() {
        int length = 5; // длина массива

        int[][] arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if ((i == j) || (i == length - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }


        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Task 5  Задать одномерный массив и найти в нем минимальный и
     *  максимальный элементы (без помощи интернета);
     */
    static void findMininalAndMaximalElementOfArray() {
        int[] arr = {1, 5, 3, 2, 11, 45, 5, 2, 4, 8, 9, 1, 20};
        int min = arr[0];
        int max = arr[0];
        System.out.print("in array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            min = (min < arr[i]) ? min : arr[i];
            max = (max > arr[i]) ? max : arr[i];
        }
        System.out.println("\n min : " + min + "\n max : " + max);
    }


}

