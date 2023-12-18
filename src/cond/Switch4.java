package cond;

//2023 java14 버전부터 나온 switch문 버전
public class Switch4 {

    public static void main(String[] args) {
        int grade = 2;

        int coupone = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 = " + coupone);
    }
}
