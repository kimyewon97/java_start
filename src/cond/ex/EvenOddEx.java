package cond.ex;

public class EvenOddEx {

    public static void main(String[] args) {
        int x = 2;

        //x % 2했을 때 나머지가 없으면 짝수, 있으면 홀수
        String result = x % 2 == 0 ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }
}
