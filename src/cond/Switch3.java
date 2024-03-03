package cond;

public class Switch3 {

    public static void main(String[] args) {
        /**
         * 등급에 따라 쿠폰 발급
         * 1등급: 쿠폰 1000원
         * 2등급: 쿠폰 2000원
         * 3등급: 쿠폰 3000원
         * 이 외: 쿠폰 500원
         * 요구사항 변경 -> 2등급도 3등급과 같은 3000원 쿠폰 지급 (2000->3000)
         */

        int grade = 2;
        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("받급 받은 쿠폰: " + coupon + "원");
    }


}

