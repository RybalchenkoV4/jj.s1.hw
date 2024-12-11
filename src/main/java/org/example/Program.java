package org.example;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = createArraysNum(10, 1, 10);
        System.out.println(numbers);

        double average = numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        System.out.printf("Среднее четное число равно %f", average);
    }

    public static ArrayList<Integer> createArraysNum (int lengthArray, int minValue, int maxValue) {

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < lengthArray; i++) {
            int randomValue = minValue + (int)(Math.random()*(maxValue - minValue + 1));
            array.add(randomValue);
        }

        return array;
    }
}