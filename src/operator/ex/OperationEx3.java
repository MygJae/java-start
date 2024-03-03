package operator.ex;

public class OperationEx3 {
    
    public static void main(String[] args) {
        //int형 변수 score 선언
        //score가 80점 이상, 100점 이하 -> ture 아니면 false
        int score = 95;
        boolean result;

        result = 80 <= score && score <= 100;

        System.out.println(result);
    }


}

