package cond.ex;

public class CondOpEx {

    public static void main(String[] args) {
        /**
         * 더 큰 숫자 찾기
         * 두 개의 정수 변수 a와 b
         * a = 10, b = 20
         * 삼항 연산자를 사용하여 더 큰 숫자를 출력
         */

        int a = 10;
        int b = 20;

        int result = (a < b) ? b : a;
        System.out.println(result);
    }


}

