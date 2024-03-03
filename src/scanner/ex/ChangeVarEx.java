 package scanner.ex;

 import java.util.Scanner;

 public class ChangeVarEx {

    public static void main(String[] args) {
        /**
         * a = 10, b = 20이고 서로의 값을 바꿔라
         */

        int a = 10;
        int b = 20;
        int tmp;
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("a: " + a + ", b: " + b);

    }


}

