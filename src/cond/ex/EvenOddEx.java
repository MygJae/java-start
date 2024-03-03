package cond.ex;

public class EvenOddEx {

    public static void main(String[] args) {
        /**
         * 홀수 짝수 찾기
         * 정수 x가 짝수면 "짝수" 홀수면 "홀수" 출력
         */
        int x = 2;

        String result = (x % 2 == 0) ? "짝수" : "홀수" ;
        System.out.println(result);
    }


}

