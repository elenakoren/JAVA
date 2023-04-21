package HW1;
/*Реализовать простой калькулятор
Минимум -- > Условия + Цикл
Введите число
Введите число
Выберите операцию
1 - сложить
2 - умножить
.*/
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numb_1 = Integer.parseInt(in.nextLine());
        System.out.println("Введите второе число:");
        int numb_2 = Integer.parseInt(in.nextLine());
        System.out.println("Введите действие (+,-,/,*):");
        String action = in.next();
        int result = 0;
        switch(action){
            case "+":
                result = numb_1 + numb_2;
                System.out.println(result);
                break;
            case "-":
                result = numb_1 - numb_2;
                System.out.println(result);  
                break;
            case "/":
                result = numb_1 / numb_2;
                System.out.println(result); 
                break;
            case "*":
                result = numb_1 * numb_2;
                System.out.println(result); 
                break;
            default:
                System.out.println("Ошибка!");  
                break;     

        }
    }
}
