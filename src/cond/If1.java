package cond;

// if 문은 특정 조건이 참인지 확인하고, 그 조건이 참인 블록을 실행한다.
public class If1 {
    public static void main(String[] args) {
        int age = 20; // 사용자의 나이

        if (age >= 18) {
            System.out.println("성인입니다.");
        }

        if (age < 18) {
            System.out.println("미성년자입니다.");
        }
    }
}
// 만역 18살 이상이면 "성인입니다."를 출력하고, 만약 18살 미만이라면 "미성년자입니다."를 출력해야한다.