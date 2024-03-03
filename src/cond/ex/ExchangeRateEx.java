package cond.ex;

public class ExchangeRateEx {

    public static void main(String[] args) {
        /**
         * 달러가 0 미만이면 "잘못된 금액입니다."
         * 달러가 0 일 때 "환전할 금액이 없습니다."
         * 달러가 0 초과일 떄 "환전 금액은 ~원 입니다."
         * 금액은 int형 변수 dollar
         */

        int dollar = 11;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = dollar * 1350;
            System.out.println("환전 금액은 " + won + "원 입니다.");
        }
    }


}

