package cond;

public class Switch1 {

    public static void main(String[] args) {
        int grand = 2;
        int coupon;

        if (grand == 1) {
            coupon = 1000;
        }else if (grand == 2) {
            coupon = 2000;
        }else if (grand == 3) {
            coupon = 3000;
        }else {
            coupon = 500;
        }
        System.out.println("발급받은 쿠폰 = " + coupon);
    }
}
