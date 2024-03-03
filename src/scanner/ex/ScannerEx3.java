package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {
        /**
         * 음식점 주문
         * 이름 foodName
         * 가격 foodPrice
         * 수량 foodQty
         * 총 가격 totalPrice
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("주문하실 음식을 입력하세요: ");
        String foodName = scanner.nextLine();

        System.out.print("음식 가격을 입력하세요: ");
        int foodPrice = scanner.nextInt();

        System.out.print("음식 수량을 입력하세요: ");
        int foodQty = scanner.nextInt();

        int totalPrice = foodPrice * foodQty;
        System.out.print("주문하신 음식은" + foodName + "이고, 총 가격은 " + totalPrice + "원 입니다.");
    }


}

