package operator;

public class Logical1 {

    public static void main(String[] args) {
        System.out.println("&&: AND 연산"); //둘 중 하나라도 거짓이면 거짓
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR 연산"); //둘 중 하나라도 참이면 참
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산"); //반대, 부정 연산자
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
    }
}
