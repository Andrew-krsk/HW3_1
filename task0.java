package Seminars.Seminar3.HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Пусть дан произвольный список целых чисел
// 1. Нужно удалить из него четные числа
// 2. Найти минимальное значение
// 3. Найти максимальное значение
// 4. Найти среднее значение

public class task0 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = createArray();
        System.out.println("Исходный список: " + list1);
        Integer min = getMin(list1);
        System.out.println("min = " + min);
        Integer max = getMax(list1);
        System.out.println("max = " + max);
        double ave = getAverage(list1);
        System.out.println("Среднее значение = " + ave);
        removeEvenValue(list1);
        System.out.println("Список после удаления четных чисел: " + list1);

    }

    private static ArrayList<Integer> createArray() {
        Integer size = 10;
        ArrayList<Integer> list1 = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            list1.add(i, i + 1);
        }
        return list1;
    }

    public static List<Integer> removeEvenValue(List<Integer> list) {
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        return list;
    }

    public static Integer getMin(List<Integer> list) {
        Integer min = Collections.min(list);
        return min;
    }

    public static Integer getMax(List<Integer> list) {
        Integer max = Collections.max(list);
        return max;
    }

    public static double getAverage(List<Integer> list){
        double ave = list.stream().mapToInt(a -> a).average().orElse(0);
        return ave;
    }

}
