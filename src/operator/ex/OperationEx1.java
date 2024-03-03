package operator.ex;

public class OperationEx1 {

    public static void main(String[] args) {
        // num1, num2, num3라는 이름의 세 개의 int 변수를 선언하고, 각각 10, 20, 30으로 초기화
        // 세 변수의 합을 계산, 그 결과 sum 이름의 int 변수에 저장
        // 세 변수의 평균을 계산, 그 결과 average 이름의 int 변수에 저장 (소수 점 이하 버림)
        // sum과 average 변수 값 출력

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int sum;
        int average;

        sum = num1 + num2 + num3;
        average = sum / 3;

        System.out.println(sum);
        System.out.println(average);
    }


}

