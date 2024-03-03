package casting;

public class Casting1 {

    public static void main(String[] args) {
        // 작은 -> 큰: 묵시적 형변환
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue1 = " + doubleValue);

        doubleValue = 20000000L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }


}

