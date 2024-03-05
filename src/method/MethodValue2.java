package method;

public class MethodValue2 {

    public static void main(String[] args) {
        int num = 5;
        System.out.println("1.changeNum 호출 전, num: " + num); // 5
        changeNum(num);
        System.out.println("4.changeNum 호출 후 num: " + num); // 10 x, 5 o
    }

    public static void changeNum(int num) {
        System.out.println("2.changeNum 변경 전, num: " + num); // 5
        num = num * 2;
        System.out.println("3.changeNum 변경 후, num: " + num); // 10
    }


}

