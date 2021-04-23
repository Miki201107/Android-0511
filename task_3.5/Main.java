/*
Задание: Дан массив с числами.
Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/

public class Main {
    public static void main(String[] args) {
        int n=0;
        int num[] = {4, 2, 6, 5, 65};
        wri (num,n);
    }

    public static void wri(int num[],int n) {

        if (n != num.length) {
            System.out.println(num[n]);
            wri(num,n+1);
        }
    }
}
