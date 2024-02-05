package ag.code.interview;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Дана сигнатура метода
 * public static void removeDuplicates(List<String> list)
 * Этот метод нужно вызвать из метода main, передав в него список с дубликатами,
 * после вызова вывести содержимое и убедиться,
 * что в исходном списке нет дубликатов.
 * Какие-либо дополнительные поля в классе создавать нельзя.
 */

public class DuplicateRemover {

    public void removeDuplicatesWithStream(List<String> list) {
        List<String> distinct = list.stream()
                .distinct()
                .collect(Collectors.toList());

        list.clear();
        list.addAll(distinct);
    }

    public void removeDuplicatesWithSet(List<String> list) {
        Set<String> uniqueElements = new HashSet<>();
        list.removeIf(element -> !uniqueElements.add(element));
    }

    public void removeDuplicatesWithSort(List<String> list) {
        Collections.sort(list);

        Iterator<String> iterator = list.iterator();

        String previous = null;

        while (iterator.hasNext()) {
            String current = iterator.next();
            if (current != null && current.equals(previous)) {
                iterator.remove();
            }
            previous = current;
        }
    }

    public static void main(String[] args) {

        List<String> listWithDuplicates = new ArrayList<>(List.of("a", "b", "c", "a", "d"));

        System.out.println("== BEFORE removeDuplicatesWithStream==");
        System.out.println(listWithDuplicates);

        DuplicateRemover remover = new DuplicateRemover();
        remover.removeDuplicatesWithStream(listWithDuplicates);

        System.out.println("== AFTER removeDuplicatesWithStream==");
        System.out.println(listWithDuplicates);


        listWithDuplicates = new ArrayList<>(List.of("a", "b", "c", "a", "d"));

        System.out.println("== BEFORE removeDuplicatesWithSet==");
        System.out.println(listWithDuplicates);

        remover.removeDuplicatesWithSet(listWithDuplicates);

        System.out.println("== AFTER removeDuplicatesWithSet==");
        System.out.println(listWithDuplicates);



        listWithDuplicates = new ArrayList<>(List.of("a", "b", "c", "a", "d"));

        System.out.println("== BEFORE removeDuplicatesWithSort==");
        System.out.println(listWithDuplicates);

        remover.removeDuplicatesWithSort(listWithDuplicates);

        System.out.println("== AFTER removeDuplicatesWithSort==");
        System.out.println(listWithDuplicates);

    }

}
