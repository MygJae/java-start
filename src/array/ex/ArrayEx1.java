package array.ex;

public class ArrayEx1 {

    public static void main(String[] args) {
        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;

        int total = student1 + student2 + student3 + student4 + student5;
        double avg = (double) total / 5;

        System.out.println("점수 총합: " + total + ", 점수 평균: " + avg);
    }


}

