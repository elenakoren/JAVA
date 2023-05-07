package HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее 
арифметическое из этого списка. Collections.max()*/
public class task2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(15);
        list.add(5);
        
        System.out.println(list);
        int max = Collections.max(list);
        System.out.println(max);
        int min = Collections.min(list);
        System.out.println(min);

        double sum = 0;
        for(int i = 0; i<list.size(); i++){
            int num = list.get(i);
            sum +=num;

        }
        
        System.out.println(sum/list.size());
    }
        
}
