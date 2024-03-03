package loop.ex;

public class WhileEx3 {

    public static void main(String[] args) {
        /**
         * 1부터 max까지의 합을 계산
         * 누적합은 int형 sum, 변수 i
         */

        int max = 100;
        int sum = 0;
        int i = 1;

        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }


}

