package DZ_3;

public class DataException extends Exception{
    public DataException() {
    }

    public void DataException(String i) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("Это не верный формат: %s", i);
        System.out.println();
    }
}
