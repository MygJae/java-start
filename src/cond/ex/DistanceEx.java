package cond.ex;

public class DistanceEx {

    public static void main(String[] args) {
        /**
         * 거리가 1km 이하면 "도보"
         * 거리가 1km 이하면 "자전거"
         * 거리가 100km 이하면 "자동차"
         * 거리가 100km 초과면 "비행기"
         * 거리는 int형 변수 distance
         */

        int distance = 101;

        if (distance <= 1) {
            System.out.println("도보를 이용하세요.");
        } else if (distance <= 10) {
            System.out.println("자전거를 이용하세요.");
        } else if (distance <= 100) {
            System.out.println("자동차를 이용하세요.");
        } else {
            System.out.println("비행기를 이용하세요.");
        }
    }


}

