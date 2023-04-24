import java.util.ArrayList;
import java.util.Arrays;

/** Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 * и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */

public class Tsk1 {
    public static void main(String[] args) {
        int[] arr1 = {12, 14, 16, 18, 110, 112, 114, 116, 118, 120};
        int[] arr2 = {3, 6, 9, 12, 15, 18, 21};
        System.out.println("Массив 1" + Arrays.toString(arr1));
        System.out.println("Массив 2" + Arrays.toString(arr2));
        System.out.println("Массив 3 - разность массивов" + difArr(arr1, arr2));
    }
    public static ArrayList<Integer> difArr(int[] a1, int[] a2){
        ArrayList<Integer> res = new ArrayList<>();
        int min = Math.min(a1.length, a2.length);
        int max = Math.max(a1.length, a2.length);
        if (min < max){
            throw new RuntimeException("Длинна массивов не равна!");
        }
        for (int i = 0; i < min; i++) {
            res.add(a1[i] - a2[i]);

        }
        return res;

    }

}
