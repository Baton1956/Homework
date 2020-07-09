package dz03;

/*  ДЗ 03 Абрамов А.

1.	Написать программу, которая загадывает случайное число от 0 до 9 и
пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить,
 больше ли указанное пользователем число, чем загаданное, или меньше.
После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ThirdHomework {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            Random r = new Random();
            int x = r.nextInt(9);
            int f;
            System.out.println("УГАДАЙТЕ ЧИСЛО!");

            for (int i = 1; i <= 3; i++) {
                f = Integer.parseInt(br.readLine());

                if (f == x) {
                    System.out.println(f + " = " + x + " ВЫ УГАДАЛИ!");
                    break;
                }
                else if (f > x) System.out.println(f + " > ЗАГАДАННОГО ЧИСЛА");
                else if (f < x) System.out.println(f + " < ЗАГАДАННОГО ЧИСЛА");

                if (i == 3) System.out.println("ПОПЫТКИ ЗАКОНЧИЛИСЬ" + "");
            }

            System.out.println("ПОВТОРИТЬ ИГРУ ЕЩЕ РАЗ? 1 - ДА/ 0 - НЕТ");

            int repeat = Integer.parseInt(br.readLine());
            while ((repeat < 0) || (repeat > 1)) {
                System.out.println("ВЕДИТЕ КОРРЕКТНЫЙ НОМЕР: 1 - YES / 0 - NO");
                repeat = Integer.parseInt(br.readLine());
            }

            if (repeat == 1) {
                System.out.println("НАЧИНАЕМ НОВУЮ ИГРУ...");
            }
            else {
                System.out.println("ПОКА!");
                return;
            }
        } while (true);
    }
}