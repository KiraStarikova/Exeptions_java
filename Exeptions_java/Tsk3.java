
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 * и возвращающий новый массив, каждый элемент которого равен сумме элементов
 * двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */

public class Tsk3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9, 11};
        int[] arr2 = {2, 4, 6, 8, 10, 12, 15};
        System.out.println("массив 1: " + Arrays.toString(arr1));
        System.out.println("массив 2: " + Arrays.toString(arr2));
        System.out.println("массив 3 - сумма массивов: " + sumArr(arr1, arr2));
    }

    public static ArrayList<Integer> sumArr(int[] a1, int[] a2) {
        ArrayList<Integer> res = new ArrayList<>();
        int min = Math.min(a1.length, a2.length);
        int max = Math.max(a1.length, a2.length);
        if (min < max){
            throw new RuntimeException("Длинна массивов не равна!");
        }
        for (int i = 0; i < min; i++) {
            res.add(a1[i] + a2[i]);
        }
        return res;
    }
}
