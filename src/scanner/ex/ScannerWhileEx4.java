 package scanner.ex;

 import java.util.Scanner;

 public class ScannerWhileEx4 {

    public static void main(String[] args) {
        /**
         * 상품 구매
         * 상품정보 입력(상품명,가격,수량)받고 총 가격 출력
         * 옵션 - 1.상품입력, 2.결제, 3.프로그램 종료
         */

        Scanner scanner = new Scanner(System.in);

        int totalCost = 0;

        while (true) {
            System.out.print("옵션을 선택하세요 - 1.상품입력, 2.결제, 3.프로그램 종료: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                scanner.nextLine();

                // 1.상품입력
                System.out.print("상품명을 입력하세요: ");
                String itemName = scanner.nextLine();

                System.out.print("가격을 입력하세요: ");
                int itemPrice = scanner.nextInt();

                System.out.print("수량을 입력하세요: ");
                int itemQty = scanner.nextInt();

                System.out.println("상품명: " + itemName + ", 가격: " + itemPrice + ", 수량: " + itemQty + ", 합계: " + itemPrice * itemQty);
                totalCost += itemPrice * itemQty;
            } else if (choice == 2) {
                // 2.결제
                System.out.println("총 결제 금액은: " + totalCost);
                totalCost = 0;
            } else if (choice == 3) {
                System.out.println("프로그램이 종료 되었습니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해 주세요.");
            }
        }
    }


}

