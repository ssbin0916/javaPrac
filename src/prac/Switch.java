package prac;

public class Switch {

    public static void main(String[] args) {
        int grade = 2;
        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
        }
        System.out.println("발급 받은 쿠폰 : " + grade);
    }
}
