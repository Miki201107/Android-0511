/*
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> spi = new ArrayList<Integer>();
        System.out.print("Введи путь к файлу - ");
        Scanner scan= new Scanner(System.in);
        String put= scan.nextLine();

        BufferedReader buf=new BufferedReader(new FileReader(put));
        String c;
        while ((c=buf.readLine())!=null){
            int i= Integer.parseInt(c);
            if (i%2==0)  spi.add(i);
        }
buf.close();

        Collections.sort(spi);
        System.out.println(spi);
    }
}
