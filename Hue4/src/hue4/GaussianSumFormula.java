package hue4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class GaussianSumFormula {
    public static boolean isNumeric(String str) {
    if (str == null) {
        return false;
    }
    try {
        double d = Double.parseDouble(str);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
    
    public void GaussianSumFormula() throws FileNotFoundException{
            Scanner input = new Scanner(System.in);
            System.out.println("n> ");
            int upperLimit = Integer.parseInt(input.nextLine());
            long[] numbers = new long[upperLimit];
            for(int i = 0; i < numbers.length; i++)
            {
                numbers[i] = i+1;
            }
            Runtime runtime = Runtime.getRuntime();
            ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newFixedThreadPool(runtime.availableProcessors());
            GaussianSumFormulaThread thread = new GaussianSumFormulaThread(numbers);
            executor.execute(thread);
            executor.shutdown();
        }
    }