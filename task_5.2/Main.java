/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>(6);
        List<String> spi = new ArrayList<>(6);

        list.add("Москва");
        list.add("Киев");
        list.add("Минск");
        list.add("Пекин");
        list.add("Лондон");
        list.add("Тверь");

        spi.add("Иванов");
        spi.add("Петров");
        spi.add("Сидоров");
        spi.add("Яковлев");
        spi.add("Семенов");
        spi.add("Усачев");

        System.out.println(list);
        System.out.println(spi);
        System.out.print("Введи город - ");

        String na = scanner.nextLine();
        System.out.println(spi.get(list.indexOf(na)));

    }
}
