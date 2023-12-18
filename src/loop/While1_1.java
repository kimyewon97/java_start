package loop;

public class While1_1 {

    public static void main(String[] args) {
        int count = 0;

        count = count + 1;
        System.out.println("현재 숫자는:" + count);

        count = count + 1;
        System.out.println("현재 숫자는:" + count);

        count = count + 1;
        System.out.println("현재 숫자는:" + count);
    }
}

/* count = count + 1 은 증감 연산자( ++ )를 사용해서 다음과 같이 개선할 수 있다.선
        count++;
        System.out.println("현재 숫자는:" + count);
        count++;
        System.out.println("현재 숫자는:" + count);
        count++;
        System.out.println("현재 숫자는:" + count);
        */
