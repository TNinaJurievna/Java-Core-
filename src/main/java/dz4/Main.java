package dz4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        task1();
        task2();
    }

    public static void task1() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Сосна");
        arrayList.add("Сосна");
        arrayList.add("Сосна");
        arrayList.add("Сосна");
        arrayList.add("Дуб");
        arrayList.add("Дуб");
        arrayList.add("Дуб");
        arrayList.add("Дуб");
        arrayList.add("Пихта");
        arrayList.add("Пихта");
        arrayList.add("Пихта");
        arrayList.add("Береза");
        arrayList.add("Сосна");
        arrayList.add("Липа");
        arrayList.add("Ель");
        arrayList.add("Ива");
        arrayList.add("Ель");
        arrayList.add("Клен");

        System.out.println("Исходный массив из " + arrayList.size() + " элементов:");
        System.out.println(arrayList);


        HashSet<String> hashSet = new LinkedHashSet<>(arrayList);
        System.out.println("");
        System.out.println("Список уникальных наименований:");
        System.out.println(hashSet);

        HashMap<String, Integer> hashMap = new LinkedHashMap<>();
        for (String key : arrayList) {
            if (hashMap.containsKey(key)) {
                int count = hashMap.get(key);
                hashMap.put(key, count + 1);
            } else {
                hashMap.put(key, 1);
            }
        }
        System.out.println("");
        System.out.println("Количество повторений слов в начальном списке:");
        System.out.println(hashMap);
    }

    public static void task2() {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Алехин", "123456789");
        phonebook.add("Алехин", "12345678910");
        phonebook.add("Алехин", "123456789");
        phonebook.add("Быков", "0123456789");
        phonebook.add("Быков", "123456789");
        phonebook.add("Ватрушкин", "123456789");
        phonebook.add("Городухин", "12345678");

        System.out.println(phonebook.hashMap);

        System.out.println(phonebook.get("Алехина"));
        System.out.println(phonebook.get("Алехин"));
    }
}
