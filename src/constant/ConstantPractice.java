package constant;

enum Fruit {
    APPLE, PEACH, BANANA;
}

enum Company {
    GOOGLE, APPLE, ORACLE;
}

public class ConstantPractice {
    public static void main(String[] args) {
        Fruit type1 = Fruit.APPLE;
        switch (type1) {
            case APPLE:
                System.out.println(1);
                break;
            case PEACH:
                System.out.println(2);
                break;
            case BANANA:
                System.out.println(3);
                break;
        }

        Company type2 = Company.APPLE;
        switch (type2) {
            case GOOGLE:
                System.out.println(1);
                break;
            case APPLE:
                System.out.println(2);
                break;
            case ORACLE:
                System.out.println(3);
                break;
        }
    }
}