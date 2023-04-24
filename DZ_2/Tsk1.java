package DZ_2; /**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
import java.util.Scanner;


public class Tsk1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean user = true;

    while (user == true) {
            System.out.println("Введите дробное число: ");
            String input = sc.nextLine();
            try {
                float floatNum = Float.parseFloat(input);
                user = false;
                System.out.println("Введённое число: " + floatNum);
            } catch (NumberFormatException e) {
                System.out.println("Не верный ввод,  ");
            }
        }
    }
}
