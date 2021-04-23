/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа.
Если эти числа равны - пусть функция вернет true, а если не равны - false.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число ....");
        int a = scan.nextInt();
        System.out.println("Введите число ....");
        int  b = scan.nextInt();

        System.out.println(comp(a,b));

    }
   public static boolean comp (int a, int b){
       return (a==b);
    }
}
