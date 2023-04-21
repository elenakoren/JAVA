package HW1;
/*Вывести все простые числа от 1 до 1000*/
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = Integer.parseInt(sc.nextLine());
        int count = 0;
        for(int i=2; i<n; i++){
            for(int j=2; j<=i; j++){
                if(i%j == 0)
                count++;          
            }
            if(count == 1){
                System.out.println(i);
            }
            count = 0;
        }
    }
}
