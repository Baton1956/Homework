package dz04;


/*DZ04, Абрамов А
Написать код игры крестики-нолики с полем N х N
 */

import java.util.*;

public class HomeworkLesson4 {
    final int size = 3;                              // константа
    char[][] map = new char[size][size];           // игровое поле
    final char cNull = '•', player = 'X', cpu1 = '0';  // константа
    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    public static void main(String[] args) {
        HomeworkLesson4 g = new HomeworkLesson4();
        g.newMap();
        g.printMap();

        // игровая логика
        while (true) {

            g.playerTurn();
            g.printMap();
            if (g.checkWin(g.player)) {
                System.out.println("\n" + "ПОЗДРАВЛЯЕМ! ТЫ ПОБЕДИТЕЛЬ");
                break;
            }
            if (g.isMapFull()) {
                System.out.println("НИЧЬЯ");
                break;
            }


            g.aiTurn(g.cpu1);
            g.printMap();
            if (g.checkWin(g.cpu1)) {
                System.out.println("ТЫ ПРОИГРАЛ");
                break;
            }
            if (g.isMapFull()) {
                System.out.println("НИЧЬЯ");
                break;
            }

        }

    }
    // начальная инициализация игровой таблицы
    void newMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = cNull;
            }
        }
    }
    // текущее состояние игровой таблицы
    void printMap() {
        for (int i = 0; i < size + 1; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.print(">X");
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(" " + (i + 1) + "  ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println(i + 1);
        }
        System.out.print(" vY ");
        for (int i = 1; i <= size; i++) System.out.print(i + "  ");
        System.out.println("O\n");
    }
    // Ход игрока. запрос координат повторяется в случае, если пользователь укажет координаты невалидной ячейки
    // (ячейка таблицы занята или не существует).
    // Если с ячейкой всё в порядке, туда заносится символ  — «крестик».
    void playerTurn() {
        int x, y;
        do {
            System.out.println("ХОД ИГРОКА X: Y:");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;

        } while (!isCellValid(x, y));
        map[y][x] = player;
    }
    // Проверка валидности ячейки.
    // true — если ячейка свободна и существует,
    // false — если ячейка занята или указаны ошибочные координаты.
    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= size || y >= size) return false; //
        if (map[y][x] == cNull) return true;
        return false;
    }
    // Проверка игровой  таблицы на «победную тройку» — три одинаковых знака подряд, по вертикали или
    // горизонтали (в цикле), а также по двум диагоналям.  В случае победы возвращается булевское значение true,
    // в противном случае — false.
    boolean checkWin(char c) {
        int countV;
        int countH;
        int countDiagonalA = 0;
        int countDiagonalB = 0;
        for (int i = 0; i <= size - 1; i++) {
            countH = 0;
            countV = 0;
            for (int j = 0; j <= size - 1; j++) {
                //проверка горизонтали
                if (map[i][j] == c) {
                    countH++;
                    if (countH == size) return true;
                }

                //проверка вертикали
                if (map[j][i] == c) {
                    countV++;
                    if (countV == size) return true;
                }
            }

            // Проверка диагонали A "\"
            if (map[i][i] == c) {
                countDiagonalA++;
                if (countDiagonalA == size) return true;
            } else countDiagonalA = 0;

            // Проверка диагонали B "/"
            if (map[i][size - 1 - i] == c) {
                countDiagonalB++;
                if (countDiagonalB == size) return true;
            } else countDiagonalB = 0;
        }
        return false;
    }
    // Проверка свободных ячеек. Если они все заняты, возвращает true.
    // Если хотя бы одна ячейка ещё свободна, возвращается false.
    boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == cNull) return false;
            }
        }
        return true;
    }
    // ход компьютера
    void aiTurn(char c) {
        int x = 0, y = 0, countH = 0, countHNull = 0, countV = 0, countVNull = 0, countDiagonalA = 0, countDiagonalB = 0, countDANull = 0, countDBNull = 0;

        // System.out.println("ХОД КОМПЬЮТЕРА[" + c + "]:");

        // Проверки хода компьютера
        for (int i = 0; i < size; i++) {
            countH = 0;
            countHNull = 0;
            countV = 0;
            countVNull = 0;
            for (int j = 0; j < size; j++) {

                if (map[j][i] == c) countV++;
                else if (map[j][i] == cNull) countVNull++;
                if ((countV == size - 1) && (countVNull == 1)) {

                    for (int k = 0; k < size; k++) {
                        if (map[k][i] == cNull) {
                            map[k][i] = c;
                            return;
                        }
                    }
                }

                if (map[i][j] == c) countH++;
                else if (map[i][j] == cNull) countHNull++;
                if ((countH == size - 1) && (countHNull == 1)) {

                    for (int k = 0; k < size; k++) {
                        if (map[i][k] == cNull) {
                            map[i][k] = c;
                            return;
                        }
                    }
                }

            }


            if (map[i][i] == c) countDiagonalA++;
            else if (map[i][i] == cNull) countDANull++;
            if ((countDiagonalA == size - 1) && (countDANull == 1)) {

                for (int j = 0; j < size; j++) {
                    if (map[j][j] == cNull) {
                        map[j][j] = c;
                        return;
                    }
                }
            }


            if (map[i][size - 1 - i] == c) countDiagonalB++;
            else if (map[i][size - 1 - i] == cNull) countDBNull++;
            if ((countDiagonalB == size - 1) && (countDBNull == 1)) {

                for (int j = 0; j < size; j++) {
                    if (map[j][size - 1 - j] == cNull) {
                        map[j][size - 1 - j] = c;
                        return;
                    }
                }
            }
        }

        countH = 0;
        countHNull = 0;
        countV = 0;
        countVNull = 0;
        countDiagonalA = 0;
        countDiagonalB = 0;
        countDANull = 0;
        countDBNull = 0;



        do {
            x = r.nextInt(size);
            y = r.nextInt(size);
        } while (!isCellValid(x, y));
        map[y][x] = c;
        System.out.println("ХОД КОМПЬЮТЕРА X: " + (x + 1) + " Y: " + (y + 1));
    }
}