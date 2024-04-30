package cond;

public class CondOp2 {
    public static void main(String[] args) {

        //삼항 연산자 :조건연산자라고 함, 자바에서는 유일하게 항이 3개이다.
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + " status = " + status);
    }
}
