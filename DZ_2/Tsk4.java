package DZ_2;

import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception,
 * когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение,
 * что пустые строки вводить нельзя.
 */
public class Tsk4 {
    public static void main(String[] args) {
        empty_string ();
    }
    public static void empty_string(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите данные: ");
        String data = scan.nextLine();
        if (!data.isEmpty()){
            System.out.println("Вы ввели: " + data);
        } else {
            throw new RuntimeException("Пустые строки вводить нельзя!");

        }
    }

}
