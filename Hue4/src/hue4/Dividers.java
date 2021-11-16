package hue4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Dividers{

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
    
    public void divide() throws FileNotFoundException{
            Scanner scanner = new Scanner(new File("numbers.csv"));
            List<Integer> numbers = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(":");
                for (int i = 0; i < line.length; i++) {
                    if (isNumeric(line[i])){
                        int n = Integer.parseInt(line[i]);
                        numbers.add(n);
                    }
                }
            }
            Scanner input = new Scanner(System.in);
            System.out.println("chunks> ");
            int chunks = Integer.parseInt(input.nextLine());
            System.out.println("divider> ");
            int divider = Integer.parseInt(input.nextLine());
            ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newFixedThreadPool(chunks);
                Thread thread = new Thread(numbers, divider);
                executor.execute(thread);
            executor.shutdown();
    }
}
