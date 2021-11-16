package hue4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String args[])
    {
        System.out.println("1...Split up to threads and print out the dividers of the numbers");
        System.out.println("2...Gaussian sum formula");
        System.out.println("3...Streams");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        if(input == 1){
            Dividers dividers = new Dividers();
            try {
                dividers.divide();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(input == 2)
        {
            GaussianSumFormula gaussian = new GaussianSumFormula();
            try {
                gaussian.GaussianSumFormula();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(input == 3){
            JavaStreamsTester javaStreamsTester = new JavaStreamsTester();
            javaStreamsTester.test();
        }
    }   
}
