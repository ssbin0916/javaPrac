package practice;

public class ArrayDemo {

    public static void main(String[] args) {

        int 국어, 영어, 수학;
        국어 = 1000;
        영어 = 20;
        수학 = 100;

        int[] score = {국어, 영어, 수학};

        for (int i = 0; i < score.length; i++) {
            int scores = score[i];
            if (scores < 0 || scores > 100) {
                System.out.println("유효하지 않는 점수입니다.");
                break;
            }
        }
    }
}
