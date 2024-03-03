package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("총 합이 30이면 종료합니다: ");
            int num1 = scanner.nextInt();

            System.out.print("총 합이 30이면 종료합니다: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;

            if (sum == 30) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열: " + num1);
            System.out.println("입력한 문자열: " + num2);
        }
    }


}

