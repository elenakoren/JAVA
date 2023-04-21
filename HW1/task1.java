package HW1;
/*1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
Перейти по ссылке, реализовать формулу на Java.*/

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n:");
        int n = Integer.parseInt(sc.nextLine());
        int result = 0;
        for (int i=1; i<=n; i++){
            result +=i;
        }
        System.out.println(result);
    }
}
