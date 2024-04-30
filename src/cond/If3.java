package cond;

public class If3 {

    public static void main(String[] args) {
        int age = 14;

        if (age <= 7) {
            System.out.println("미취학 아동입니다.");
        } if( age >= 8 && age <= 13){
            System.out.println("초등학생 입니다.");
        }if(age >= 13 && age <= 16 ) {
            System.out.println("중학생입니다.");
        }if(age >= 16 && age <= 19 ) {
            System.out.println("고등학생입니다.");
        }if(age >= 20){
            System.out.println("성인입니다.");
        }
    }
}
