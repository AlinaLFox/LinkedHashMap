import java.util.*;

public class Main {
    public static void main(String[] args) {
        // создали LinkedHashMap
        LinkedHashMap<String, Integer> newMap = new LinkedHashMap<>();
        // добавили элементы
        newMap.put("Alina", 25);
        newMap.put("Basil", 26);
        newMap.put("Danila", 18);
        newMap.put("Anna", 26);
        // вывели на консоль
        System.out.println("Punctul 1");
        System.out.println(newMap);
        // разделяю задания
        System.out.println("--------------------");
        // создали LinkedHashSet
        // так как мои ЗНАЧЕНИЯ типа Integer, я создаю LInkedHashSet с типом данных Integer
        LinkedHashSet<Integer> newSet = new LinkedHashSet<>();
        // добавили foreach
        // parcurgem (folosirea FOREACH) LinkedHashMap si adaugam VALORILE in LinkedHashSet
        for (Map.Entry<String, Integer> entry : newMap.entrySet()) {
            newSet.add((entry.getValue()));
        }
        // afisam la consola
        System.out.println("Punctul 2");
        System.out.println(newSet);
        System.out.println("--------------------");
        // creem LinkedList
        // так как мои КЛЮЧИ типа String, я создаю LInkedList с типом данных String
        LinkedList<String> newList = new LinkedList<>();
        // parcurgem (FOREACH) LinkedHashMap si adaugam CHEILE (keys) in LinkedList
        // коллекция Map -> Entry (приказываю войти) - даю имя "entry" ->
        // -> присваиваю его элементам значения элементов моего LinkedHashMap "newMap"
        // -> приказываем добавить значения в мой newList -> приказываю entry получить ключи (getKey)
        for (Map.Entry<String, Integer> entry : newMap.entrySet()) {
            newList.add((entry.getKey()));
        }
        System.out.println("Punctul 3");
        System.out.println(newList);


    }
}