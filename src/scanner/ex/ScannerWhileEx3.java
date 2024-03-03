package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        /**
         * 입력한 숫자의 합계와 평균
         */

        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        int count = 0;

/*
        while (true) {
            System.out.print("숫자를 입력하세요(0을 누르면 중단): ");
            num = scanner.nextInt();
            if (num == 0) {
                System.out.println("시스템을 종료합니다.");
                break;
            }
            sum += num;
            count++;
        }
*/
        System.out.print("숫자를 입력하세요(0을 누르면 중단): ");
        while ((num = scanner.nextInt()) != 0) {
            System.out.print("숫자를 입력하세요(0을 누르면 중단): ");
            sum += num;
            count++;
        }

        double avg = (double) sum / count;
        System.out.println("입력하신 숫자의 합계는 " + sum + "이고, 평균은 " + avg + "입니다.");
    }


}

