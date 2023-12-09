package cafe;

public class Exchange {

    public int order(String menu, int money) {
        if (menu.equals("MilkTea")) {
            return money - 3000;
        }

        if (menu.equals("IceTea")) {
            return money - 2000;
        }

        return 0;
    }

    public static void main(String[] args) {
        Exchange payment = new Exchange();
        int result = payment.order("MilkTea", 5000);

        if (result < 0) {
            System.out.println(-result + "원이 부족합니다.");
        } else {
            System.out.println("거스름돈은 " + result + "원입니다.");
        }
    }
}
