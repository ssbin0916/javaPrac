package practice;

class Calculator {
    int left, right;

    //public Calculator() {}

    //public void setOrands(int left, int right) {
    public Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        super(left, right);
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

class DivisionableCalculator extends SubstractionableCalculator {
    public DivisionableCalculator(int left, int right) {
        super(left, right);
    }

    public void division() {
        System.out.println(this.left / this.right);
    }
}

class MulplicationableCalculator extends DivisionableCalculator {
    public MulplicationableCalculator(int left, int right) {
        super(left, right);
    }

    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}

public class CalculatorDemo1 {

    public static void main(String[] args) {

        //SubstractionableCalculator c1 = new SubstractionableCalculator();
        //DivisionableCalculator c1 = new DivisionableCalculator();
        MulplicationableCalculator c1 = new MulplicationableCalculator(10, 20);
        //c1.setOrands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
        c1.division();
        c1.multiplication();
    }
}