
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone(new FullName("Иванов", "Иван"), "8 900 800 70 01");
        phoneBook.addPhone(new FullName("Иванов", "Александр"), "8 900 800 70 02");
        phoneBook.addPhone(new FullName("Иванов", "Сергей"), "8 900 800 70 03");
        phoneBook.addPhone(new FullName("Иванов", "Алексей"), "8 900 800 70 04");
        phoneBook.addPhone(new FullName("Иванов", "Петр"), "8 900 800 70 05");
        phoneBook.addPhone(new FullName("Иванов", "Максим"), "8 900 800 70 06");
        phoneBook.addPhone(new FullName("Иванов", "Артур"), "8 900 800 70 07");
        phoneBook.addPhone(new FullName("Иванов", "Дмитрий"), "8 900 800 70 08");
        phoneBook.addPhone(new FullName("Иванов", "Артем "), "8 900 800 70 09");
        phoneBook.addPhone(new FullName("Петров", "Иван"), "8 900 800 70 10");
        phoneBook.addPhone(new FullName("Петров", "Александр"), "8 900 800 70 11");
        phoneBook.addPhone(new FullName("Петров", "Сергей"), "8 900 800 70 12");
        phoneBook.addPhone(new FullName("Петров", "Алексей"), "8 900 800 70 13");
        phoneBook.addPhone(new FullName("Петров", "Петр"), "8 900 800 70 14");
        phoneBook.addPhone(new FullName("Петров", "Максим"), "8 900 800 70 15");
        phoneBook.addPhone(new FullName("Петров", "Артур"), "8 900 800 70 16");
        phoneBook.addPhone(new FullName("Петров", "Дмитрий"), "8 900 800 70 17");
        phoneBook.addPhone(new FullName("Петров", "Артем "), "8 900 800 70 18");
        phoneBook.addPhone(new FullName("Сидоров", "Дмитрий"), "8 900 800 70 19");
        phoneBook.addPhone(new FullName("Сидоров", "Артем "), "8 900 800 70 20");

        System.out.println("ДЗ 1, 1");
        for (Map.Entry<FullName, String> entry : phoneBook.getEntries()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
        }

        System.out.println("ДЗ 1, 3");
        MapCollection.addMap("First", 1);
        MapCollection.addMap("Second", 2);
        MapCollection.addMap("Third", 3);
        MapCollection.addMap("Third", 5);
        MapCollection.addMap("Fourth", 4);
        System.out.println(MapCollection.map);


        System.out.println("ДЗ 2, 1");
        MapList mapList = new MapList();
        System.out.println(mapList.keysAndValues());
        System.out.println( mapList.convertCollection());

        System.out.println("ДЗ 2, 2");
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(0, "map1");
        map.put(1, "map2");
        map.put(2, "map3");
        map.put(3, "map4");
        map.put(4, "map5");
        map.put(5, "map6");
        map.put(6, "map7");
        map.put(7, "map8");
        map.put(8, "map9");
        map.put(9, "map10");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.printf("%d : %s%n", entry.getKey(), entry.getValue());
        }






    }
}