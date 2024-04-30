package cond.ex;

public class ScoreEx2 {
    public static void main(String[] args) {

        int disrance = 30;

        if (disrance <= 1) {
            System.out.println("도보입니다");
        } else if (disrance <= 10) {
            System.out.println("자전거 입니다.");
        } else if (disrance <= 100) {
            System.out.println("자동차입니다");
        } else {
            System.out.println("비행기입니다.");
        }
    }
}
