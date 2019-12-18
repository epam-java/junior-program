package com.epam.jmp.patterns.strategy;

import java.util.Random;

/**
 * Алгоритм сртировки зашит в классе MyArray.
 * Необходимо добавить возможность, при необходимости, кастомизировать сортировку.
 */
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        MyArray array = new MyArray(10);

        for (int i = 0; i < array.length(); i++) {
            array.set(i, random.nextInt(100));
        }
        System.out.println(array);

        array.sort();
        System.out.println(array);
    }
}
