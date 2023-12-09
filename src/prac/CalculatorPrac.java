package prac;

class Calculator {
    int left, right;

    public void set(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }

    public void sub() {
        System.out.println(this.left - this.right);
    }

    public void div() {
        System.out.println(this.left / this.right);
    }

    public void mul() {
        System.out.println(this.left * this.right);
    }
}

public class CalculatorPrac {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.set(10, 2);
        calculator.sum();
        calculator.avg();
        calculator.sub();
        calculator.div();
        calculator.mul();
    }
}
