package loop.ex;

public class NestedEx2 {

    public static void main(String[] args) {
        /**
         * 피라미드 출력
         */

        int str = 10;
        for (int i = 1; i <= str; i++) {
            for (int j = 1; j <= str - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


}

