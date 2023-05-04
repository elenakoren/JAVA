package HW2;
// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

public class task0 {
    public static void main(String[] args) {
        String stones = "aaaAbbbB";
        String jewels1 = "a";
        String jewels2 = "B";
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < stones.length() ; i++) {
            if (jewels1.equals((String.valueOf(stones.charAt(i))))){
                count1 ++;
               } 
        }
        for (int j = 0; j < stones.length() ; j++) {      
            if (jewels2.equals((String.valueOf(stones.charAt(j))))){
                count2 ++;
                }
        }
        System.out.printf("a%d", count1);
        System.out.printf("B%d",count2);  
    }
}
