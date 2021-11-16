package hue4;

import java.util.ArrayList;
import java.util.List;

public class Thread implements Runnable{

    List<Integer> numbers;
    int divider;
    
    public Thread(List<Integer> numbers, int divider)
    {
        this.numbers = numbers;
        this.divider = divider;
    }
    
    @Override
    public void run() {
        List<Integer> list = new ArrayList<>();
        for(int i : numbers){
            if(i % divider == 0){
                System.out.println(i);
                list.add(i);
            }
        }
    }
}
