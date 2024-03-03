package loop.ex;

public class ForEx2 {

    public static void main(String[] args) {
        /**
         * 처음 10개의 짝수를 출력
         * 짝수는 int형 num
         */

        int num = 2;

        for (int count = 1; count <= 10; count++) {
            System.out.println(num);
            num += 2;
        }
    }


}

