package HW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/*Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
Вывести название каждой планеты и количество его повторений в списке.*/
public class task3 {
    private static final String ArrayUtils = null;

    public static void main(String[] args) {
        
        String[] planets = {"Марс", "Венера", "Марс", "Земля", "Уран", "Уран", "Марс", "Юпитер", "Сатурн", "Земля"};
        
        System.out.println(planets);

        for (int i = 0; i < planets.length; i++){
            String planet = planets[i];
            int count = 1;
            
            for (int j = i + 1; j<planets.length; j++ ){
                if(planet.equals(planets[j])){
                    count++;
                    planets = removeElement(planets, planets[j]) ;
                    j--;
        
                }
            
            }
           
            planets = removeElement(planets, planet);
            i--;
            System.out.println(planet + " - " + count);    
            
        }
        
    }
    public static String[] removeElement(String[] arr, String item) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.remove(item);
        return list.toArray(String[]::new);
    }
    
    
    
}
