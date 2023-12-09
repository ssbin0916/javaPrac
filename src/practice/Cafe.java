package practice;

public class Cafe {

    public int cafe(String menu, int money) {
        if (menu.equals("Milk Tea")) {
            return money - 3000;
        }

        if (menu.equals("Ice Tea")) {
            return money - 2000;
        }

        return 0;
    }

    public static void main(String[] args) {
        Cafe price = new Cafe();
        int result = price.cafe("Milk Tea", 5000);

        if(result < 0) {
            System.out.println(-result + "이 부족합니다.");
        } else {
            System.out.println("거스름돈은 " + result + "입니다.");
        }


    }
}
