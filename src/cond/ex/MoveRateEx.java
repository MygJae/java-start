package cond.ex;

public class MoveRateEx {

    public static void main(String[] args) {
        /**
         * 요청한 평점 이상의 영화를 찾아서 추천
         * 어바웃타임 - 평점9
         * 토이 스토리 - 평점8
         * 고질라 - 평점7
         * 평점은 double형 변수 rating
         */

        double rating = 7.1;

        if (rating <= 9) {
            System.out.println("[어바웃타임]을 추천합니다.");
        }

        if (rating <= 8) {
            System.out.println("[토이 스토리]을 추천합니다.");
        }

        if (rating <= 7) {
            System.out.println("[고질라]을 추천합니다.");
        }
    }


}

