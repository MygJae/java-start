package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {

    public static void main(String[] args) {
        /**
         * 상품 가격 계산기
         */

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 가격을 입력하세요(-1 입력시 종료): ");
            int price = scanner.nextInt();
            if (price == -1) {
                System.out.println("시스템 종료합니다.");
                break;
            }

            System.out.print("상품의 수량을 입력하세요: ");
            int qty = scanner.nextInt();

            System.out.println("상품 총 가격은 " + price*qty);
        }
    }


}

