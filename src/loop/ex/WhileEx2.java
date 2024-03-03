package loop.ex;

public class WhileEx2 {

    public static void main(String[] args) {
        /**
         * 처음 10개의 짝수를 출력
         * 짝수는 int형 num
         */

        int num = 2;
        int count = 1;

        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }
    }


}

