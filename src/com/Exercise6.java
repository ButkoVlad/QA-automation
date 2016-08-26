package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class Exercise6 {

    //--------------------------------TASK 1 (6.1)----------------------------------

    private static void EvensOdds(Integer[] numbers) {

        ArrayList<Integer> evens = new ArrayList<Integer>();
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evens.add(number);
            } else {
                odds.add(number);
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("Четные: " + evens);
        System.out.println("Нечетные: " + odds);
    }

    //--------------------------------TASK 1 (6.2)----------------------------------

    private static void MaxAndMin(Integer[] numbers) {
        List<Integer> number = Arrays.asList(numbers);
        System.out.println("-------------------------------------");
        System.out.println("Наибольшее: " + max(number));
        System.out.println("Наименьшее: " + min(number));
    }

    //--------------------------------TASK 1 (6.3, 6.4)----------------------------------

    private static void Divide(int divider, Integer[] numbers) {
        System.out.println("-------------------------------------");
        System.out.println("Числа, которые делятся на " + divider + ": ");
        for (Integer number : numbers) {
            if (number % divider == 0) {
                System.out.print(number + ", ");
            }
        }
    }

    //--------------------------------TASK 1 (6.5)----------------------------------

    private static void WithoutIdenticalNumbers(Integer[] numbers) {
        String number;
        List<Integer> result = new ArrayList<Integer>();
        for (Integer sourceNumber : numbers) {
            number = sourceNumber.toString();
            if (number.length() == 3 && number.charAt(0) != number.charAt(1)
                    && number.charAt(1) != number.charAt(2)
                    && number.charAt(0) != number.charAt(2)) {
                result.add(sourceNumber);
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Все трехзначные числа, в десятичной записи которых нет одинаковых цифр: " + result);
    }

    //--------------------------------TASK 1 (6.6)----------------------------------

    private static void HappyNumbers(Integer[] numbers) {
        String number;
        List<Integer> result = new ArrayList<Integer>();
        for (Integer sourceNumber : numbers) {
            number = sourceNumber.toString();
            if (number.length() == 4
                    && number.charAt(0) + number.charAt(1) == number.charAt(2)
                    + number.charAt(3)) {
                result.add(sourceNumber);
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("“Счастливые” числа (Сумма 1-ой пары чисел = Сумме 2-ой пары): " + result);

    }


    //--------------------------------TASK 1 (6.7)----------------------------------

    private static void HalfSum(Integer[] numbers) {
        Integer[] number = numbers.clone();
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i < number.length - 1; i++) {
            if (number.length < 3) {
                break;
            }

            if (number[i] == (number[i - 1] + number[i + 1]) / 2) {
                result.add(number[i]);
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Элементы, которые равны полусумме соседних элементов:" + result);
    }


    public static void main(String[] args) {
        System.out.print("Количество чисел: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        if (size == 0) {
            System.out.println("Программа завершена");
            System.exit(0);
        }
        Integer[] numbers = new Integer[size];
        System.out.print("Введите целые числа и нажмите <Enter>: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = in.nextInt();
        }
        EvensOdds(numbers);

        MaxAndMin(numbers);

        Divide(3, numbers);
        Divide(9, numbers);

        Divide(5, numbers);
        Divide(7, numbers);

        WithoutIdenticalNumbers(numbers);

        HappyNumbers(numbers);

        HalfSum(numbers);
    }
}
