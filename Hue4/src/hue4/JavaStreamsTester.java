package hue4;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class JavaStreamsTester {
    
    private static int getCountEmptyString(List<String> strings) {
        return (int) strings.stream().filter(str -> str.isEmpty()).count();
    }
    private static int getCountLength3(List<String> strings) {
        return (int) strings.stream().filter(string -> string.length() == 3).count();
    }
    private static List<String> deleteEmptyStrings(List<String> strings) {
        return strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
    }
    private static String getMergedString(List<String> strings, String seperator) {
        return strings.stream().collect(Collectors.joining(seperator));
    }
    private static List<Integer> getSquares(List<Integer> numbers){
        return numbers.stream().map(number -> number*number).collect(Collectors.toList());
    }
    private static int getMax(List<Integer> numbers){
        return numbers.stream().mapToInt(number -> number).max().orElseThrow(NoSuchElementException::new);
    }
    private static int getMin(List<Integer> numbers){
        return numbers.stream().mapToInt(number -> number).min().orElseThrow(NoSuchElementException::new);
    }
    private static int getSum(List<Integer> numbers){
        return numbers.stream().reduce(0, Integer::sum);
    }
    private static double getAverage(List<Integer> numbers){
        return numbers.stream().mapToDouble(number -> number).average().getAsDouble();
    }
    
    public static void test(){
        List<String> testListString = new ArrayList<>();
        String seperator = ";";
        List<Integer> testListInteger = new ArrayList<>();
        getCountEmptyString(testListString);
        getCountLength3(testListString);
        deleteEmptyStrings(testListString);
        getMergedString(testListString, seperator);
        getSquares(testListInteger);
        getMax(testListInteger);
        getMin(testListInteger);
        getSum(testListInteger);
        getAverage(testListInteger);
    }
}
