package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt();

        String result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println("입력하신 숫자는 " + result + "입니다.");
    }


}