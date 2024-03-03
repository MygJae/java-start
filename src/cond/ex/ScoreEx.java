package cond.ex;

public class ScoreEx {

    public static void main(String[] args) {
        /**
         * 90점 이상: "A"
         * 80점 이상, 90점 미만: "B"
         * 70점 이상, 80점 미만: "C"
         * 60점 이상, 70점 미만: "D"
         * 60점 미만: "F"
         * 점수는 int형 변수 score
         */
        String grade = "";
        int score = 80;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("score: " + score);
        System.out.println("학점은 " + grade + "입니다.");
    }




}

