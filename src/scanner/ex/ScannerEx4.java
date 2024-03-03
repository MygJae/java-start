package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        /**
         * 구구단 출력
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("원하는 구구단 단수를 입력하세요: ");
        int num = scanner.nextInt();
        System.out.println(num + "단의 구구단");
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " X " + num + " = " + i * num);
        }
    }


}

