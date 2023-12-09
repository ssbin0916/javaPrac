package prac;

public class Cafe {

    public int order(String menu, int money) {
        if (menu.equals("Milk Tea")) {
            return money - 7000;
        }
        if (menu.equals("Ice Americano")) {
            return money - 5000;
        }
        return 0;
    }

    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        int result = cafe.order("Milk Tea", 10000);

        if (result < 0) {
            System.out.println(-result + "원이 부족합니다.");
        } else {
            System.out.println("거스름돈은 " + result + "원입니다.");
        }
    }

}