package scanner.ex;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        /**
         * 이름과 나이 반복 입력 가능
         */
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요(종료를 입력하면 종료): ");
            String name = scanner.nextLine();

            if (name == "종료") {
                System.out.println("프로그램 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = scanner.nextInt();
            scanner.nextLine(); //줄바꿈 처리

            System.out.println("입력하신 이름: " + name + ", 나이: " + age);
        }
    }


}

