/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию
 * только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> nums1=new ArrayList<>();
        ArrayList<Integer> nums2=new ArrayList<>();
        for (int i=-10; i<20; i++) {
            nums1.add(i);
            if (i>0 & i<10){
                nums2.add(i);
            }
        }
        System.out.println(nums1);
        System.out.println(nums2);

// Получаем ответ
        nums1.retainAll(nums2);
        System.out.println("Результат:");
        System.out.println(nums1);

    }
}
