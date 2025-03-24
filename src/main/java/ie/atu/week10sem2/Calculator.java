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
}
