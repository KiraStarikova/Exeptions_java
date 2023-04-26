package DZ_3;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("Это не правильные данные: %s", i);
        System.out.println();
    }
}
