
/**Java. Homework 2
 * 
 * @author Lionovich
 * @date 08.04.2022
 */

import java.util.Arrays;

public class HomeworkApp3 {
    public static void main(String[] args) {
        System.out.println("\n\nTask 1\n");
        invertArray();
        System.out.println("\n\nTask 2\n");
        fillArray();
        System.out.println("\n\nTask 3\n");
        multiplyArray();
        System.out.println("\n\nTask 4\n");
        fillDiagonal();
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    static void invertArray() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        System.out.print(Arrays.toString(arr));
    }

    /**
     * 2. Задать пустой целочисленный массив длиной 100.
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
     */
    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.print(Arrays.toString(arr));
    }

    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2
     */
    static void multiplyArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] <= 6 ? arr[i] * 2 : arr[i];
        }
        System.out.print(Arrays.toString(arr));
    }

    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и
     * столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно
     * только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы
     * таких элементов равны,
     * то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            int j = 4 - i;
            arr[j][i] = 1;
            arr[j][j] = 1;
            System.out.println(Arrays.toString(arr[j]));
        }
    }
}