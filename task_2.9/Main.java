/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
       int [] x={2,3,4,5,6,7};
       int n=0;

        System.out.print( "нет" );

            while (n< x.length) {
                if (x[n] ==5 ) System.out.print("\r да");
                n++;
            }
    }
}
