package HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/*Пусть дан произвольный список целых чисел, удалить из него четные числа */
public class task1 {
    public static void main(String[] args) {
    
       
        List<Integer> list = createList(10, 4, 10);
        
        System.out.println(list);
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.println(list);
    }
    
    static List<Integer> createList(int capacity, int min, int max){
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            result.add((int)(Math.random() * (max-min+1) + min));
        }
        return result;
    }

    
} 
    
    