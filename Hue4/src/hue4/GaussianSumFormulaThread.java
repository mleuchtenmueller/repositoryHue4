package hue4;

public class GaussianSumFormulaThread implements Runnable{
    long[] numbers;
    
    public GaussianSumFormulaThread(long[] numbers)
    {
        this.numbers = numbers;
    }
    
    @Override
    public void run() {
        long sum = (numbers[numbers.length-1] * (numbers.length+1))/2;
        System.out.println(sum);
    }
}
