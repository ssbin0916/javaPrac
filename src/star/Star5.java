package star;

public class Star5 {

    public static void main(String[] args) {
        int rows = 10;
        for(int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
