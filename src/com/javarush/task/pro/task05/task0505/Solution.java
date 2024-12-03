package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse

Тебе нужно написать программу, которая:

Считывает с консоли целое число N.
Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
Каждое число выводить с новой строки. Число N выводить не нужно.
Требования:
•	Программа должна считывать число N и за ним еще N чисел.
•	В классе должен быть метод public static void main(String[]).
•	Нельзя добавлять новые методы в класс Solution.
•	Программа должна выводить введенные N чисел в обратном порядке, если N чётное.
•	Программа должна выводить введенные N чисел в том же порядке, если N нечётное.
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        if (count > 0) {
            int[] arrayScanner = new int[count];
            for (int k = 0; k < arrayScanner.length; k++) {
                arrayScanner[k] = scanner.nextInt();
            }

            if ((count % 2) == 0) {
                for (int i = 0, countN = arrayScanner.length -1; i < arrayScanner.length; i++, countN--) {
                    System.out.println(arrayScanner[countN]);
                }
            } else {
                for (int j = 0; j < arrayScanner.length; j++) {
                    System.out.println(arrayScanner[j]);
                }
            }
        }

    }
}
