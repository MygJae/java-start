package casting;

public class Casting3 {

    public static void main(String[] args) {
        //오버플로우 될 경우
        long maxIntValue = 2147483647L; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue casting= " + intValue); // 출력:2147483647

        //오버플로우
        intValue = (int) maxIntOver; // 형변환
        System.out.println("maxIntOver casting= " + intValue); // 출력:-2147483648
    }


}

