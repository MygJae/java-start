package cond;

public class Switch1 {

    public static void main(String[] args) {
        /**
         * 등급에 따라 쿠폰 발급
         * 1등급: 쿠폰 1000원
         * 2등급: 쿠폰 2000원
         * 3등급: 쿠폰 3000원
         * 이 외: 쿠폰 500원
         */

        int grade = 2;
        int coupon;

        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }
        System.out.println("받급 받은 쿠폰: " + coupon + "원");
    }


}

