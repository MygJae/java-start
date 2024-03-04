package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {
        /**
         * 상품 관리 프로그램 만들기
         *   상품 등록: 상품이름(productNames), 가격(productPrices) 입력 받아 저장
         *   상품 목록: 모든 상품 출력(productList)
         * 옵션 3가지 - 1.상품등록, 2.상품목록, 3.종료
         * 조건: 상품은 최대 10개 등록 (productCount)
         */

        Scanner scanner = new Scanner(System.in);

        int productCount = 0;
        int productMaxCount = 10;
        String[] productNames = new String[productMaxCount];
        int[] productPrices = new int[productMaxCount];

        while (true) {
            System.out.println("1.상품등록 | 2.상품목록 | 3.종료");
            int option = scanner.nextInt();

            if (option == 1) {
                if (productCount >= productMaxCount) {
                    System.out.println("등록하실 상품이 초과 되었습니다.");
                    continue;
                }
                scanner.nextLine();

                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = scanner.nextInt();

                productCount++;
            } else if (option == 2) {
                System.out.println("상품 목록");
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                for (int i = 0; i < productCount; i++) {
                    System.out.println("상품명: " + productNames[i] + ", 가격: " + productPrices[i]+  "원");
                }
            } else if (option == 3) {
                System.out.println("프로그램 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 옵션 번호입니다.");
            }
        }
    }


}

