package method;

public class MethodReturn2 {

    public static void main(String[] args) {
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자 입니다.");
            return;
        }
        System.out.println(age + "살, 성인 입니다.");
    }


}

