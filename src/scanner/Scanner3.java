package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        /**
         * 두 개의 정수를 입력 받고, 더 큰 수를 출력
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();


        int max = (num1 < num2) ? num2 : num1;
        System.out.println("더 큰 수: " + max);
    }


}

