package cond;

//만약 break 문이 없으면 어떻게 되는지 확인하기 위해 조건을 변경해보자.
//비즈니스 요구사항이 변경되었다. 2등급도 3등급과 같이 3000원 쿠폰을 준다고 해보자.
public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 = " + coupon);
    }
}

