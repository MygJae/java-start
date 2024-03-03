package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {

    public static void main(String[] args) {
        /**
         * 사이 숫자 출력
         * 입력의 두 값의 비교하여 큰 값 찾기
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        int min = (num1 > num2) ? num2 : num1;
        int max = (num1 < num2) ? num2 : num1;

        for (int i = min; i <= max; i++) {
            System.out.print(i);
            if (i < max) {
                System.out.print(", ");
            }
        }

        System.out.println();
        if (num1 > num2) {
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i < num2) {
                System.out.print(", ");
            }
        }
    }


}

