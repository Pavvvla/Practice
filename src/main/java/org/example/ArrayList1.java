package org.example;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args) {

     ArrayList<String> list = new ArrayList<>();
        list.add(0,"A");
        list.add(1,"D");
        list.add(2,"K");
        list.add(3,"N");
        list.add(4,"B");
        list.add(5,"L");
        list.add(6,"C");
        System.out.println("Массив лист: " + list);

        Collections.sort(list);
        System.out.println("Сортировка:" + list);

        java.util.ArrayList<String> secondList = new java.util.ArrayList<String>(list);
        System.out.println("Первое добавление: " + secondList);

        list.addAll(secondList);
        System.out.println("Второй лист: " + secondList);

        secondList.clear();
        System.out.println("Удаление: " + secondList);

        System.out.println("Получить второй элемент: " + list.get(1));

        java.util.ArrayList<Integer> arr = new java.util.ArrayList<Integer>();
        System.out.println(arr);
        System.out.println(arr.isEmpty());

        list.remove(3);
        System.out.println("Удаление третьего элемента: " + list);

        list.remove("N");
        System.out.println("Удаление  элемента: \"N\"" + list);
    }
}
