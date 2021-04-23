/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/

public class Main {
    public static void main(String[] args) {
       int [] x={2,3,4,5};
       int n=1;

               for (int i=0;i<4;i++) {
                   n*=x[i];
                   System.out.println( i + " "  n );
               }
    }
}
