package cond;

public class Switch4 {

    public static void main(String[] args) {
        /**
         * 등급에 따라 쿠폰 발급
         * 1등급: 쿠폰 1000원
         * 2등급: 쿠폰 2000원
         * 3등급: 쿠폰 3000원
         * 이 외: 쿠폰 500원
         */

        int grade = 1;
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("받급 받은 쿠폰: " + coupon + "원");
    }


}

