package cond.ex;

public class MoveRateEx {

    public static void main(String[] args) {
        double ratting = 7.1;

        if (ratting <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (ratting <= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }
        if (ratting <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
