package ie.atu.week10sem2;

public class Calculator {
    public int add(int firstNum, int secondNum)
    {
        long result = (long) firstNum + secondNum;
        if(result > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Your values are too big");
        }
        return (int) result;
    }

    public int subtract(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        if (result < 0) {
            throw new IllegalStateException("Negative results not allowed");
        }
        return result;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public int multiply(int a, int b) {
        long result = (long) a * b;
        if (result > Integer.MAX_VALUE) {
            throw new UnsupportedOperationException("Multiplication overflow");
        }
        return (int) result;
    }

}
