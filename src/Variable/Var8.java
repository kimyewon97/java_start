package Variable;

public class Var8 {

    public static void main(String[] args) {
        //정수
        byte b = 127; //-128 ~ 127
        short s = 32767; //-32,768 ~ 32,767
        int i = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 21억)

        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L; //뒤에 L 붙이기

        //실수
        float f = 10.0f; //뒤에 f 붙이기
        double d = 10.0; //훨씬더 큰 범위의 실수
    }
}
