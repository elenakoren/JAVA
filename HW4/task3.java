package HW4;

import java.util.Iterator;
import java.util.LinkedList;

/*Найдите сумму всех элементов LinkedList, сохраняя все элементы в
 списке. Используйте итератор*/
public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(7);

        int sum = 0;
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()){
            sum+= iter.next();
        }
        System.out.println(sum);

        
    }

    
}
