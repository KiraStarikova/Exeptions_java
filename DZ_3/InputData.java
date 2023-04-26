package DZ_3;

import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку через ПРОБЕЛ в формате: " +
                    "Ф.И.О, дата рождения - dd.mm.yyyy, номер телефона - цифры, пол - ж/м ) : ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("вы ввели не все данные, попробуйте ещё раз");
            } else System.out.println("вы ввели больше данных, чем требуется, попробуйте ещё раз");
        }

    }
}
