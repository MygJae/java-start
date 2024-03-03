package cond;

public class If5 {

    public static void main(String[] args) {
        /**
         * 할인 조건
         *   아이템 가격이 만원 이상이면 천원 할인
         *   나이가 10살 이하면 천원 할인
         * 한 사용자가 동시에 여러 할인을 받을 수 있음
         * 각 조건이 적용 할 때는 else if로 묶으면 안된다.
         */
        int price = 10000; // 아이템 가격
        int age = 10; // 나이
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("만원 이상 구매, 천원 할인");
        } else if (age <= 10) {
            discount += 1000;
            System.out.println("어린이 천원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");
    }


}

