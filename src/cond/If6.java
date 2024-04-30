package cond;

public class If6 {

    public static void main(String[] args) {

        int price = 10000;
        int age = 10;
        int discount = 0;

        //2개가 다른 조건이기 때문에 if문을 따로 작성해야 됨
        if(price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000 이상 구매 시 1000원 할인");
        } else if(age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 할인 1000원");
        } else {
            System.out.println("할인없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");

         if(true)
            System.out.println("if문에서 실행됨");

    }
}
