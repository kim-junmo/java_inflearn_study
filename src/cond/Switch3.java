package cond;

public class Switch3 {
//siwtch문은 항상 break와 함께 사용한다.
    public static void main(String[] args) {
        int grand = 2;
        int coupon;

        switch (grand) {
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
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
