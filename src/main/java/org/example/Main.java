package org.example;

import java.util.*;

public class Main {
    static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    static List<String> words = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i : nums) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        Collections.sort(nums);
        int number = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i % 2 == 0 && i != number) {
                System.out.println(i);
                number = i;
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        Set<String> randomWords = new HashSet<>(words);
        System.out.println(randomWords);
    }

    public static void task4() {
        System.out.println("Задача 4");
        Set<String> randomWords = new HashSet<>(words);
        System.out.println(words.size() - randomWords.size());
    }
}