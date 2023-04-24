/**
 * Реализуйте метод, принимающий в качестве аргументов двумерный массив.
 * Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
 * детализировать какие строки со столбцами не требуется.
 */

import java.util.Random;

public class Tsk4 {
    public static void main(String[] args) {
        array();
        printArray(array());
        matrix(array());

    }
    private static int[][] array() {
        Random rnd = new Random();
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(4);
            }
        }

        return matrix;
    }

    public static boolean matrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix.length) {
                System.out.println("-");
                return false;
            }
        }
        System.out.println("+");
        return true;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}

