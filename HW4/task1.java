package HW4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, 
который вернет “перевернутый” список. 
Постараться не обращаться к листу по индексам.*/
public class task1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("hello");
        list.add("java");
        list.add("word");
        list.add("buy");
        

        ListIterator<String> iter = list.listIterator();

        while(iter.hasNext()){
         
            System.out.println(iter.next());
        }

        
        while(iter.hasPrevious()){
            System.out.println(iter.previous());

        }
        
}
    
}
