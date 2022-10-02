package Homework05;

import java.util.Arrays;


public class Task01 {
    public static void main(String[] args) {
        //Заполните массив на N элементов случайным целыми числами и выведете максимальное,
        // минимальное и среднее арифметическое значение элементов массива

        int[] array1 = new int[25];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int)(Math.random() * 100) );
            Arrays.sort(array1);

        }

        double average = 0;
        if (array1.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < array1.length; j++) {
                sum += array1[j];
            }
            average = sum / array1.length;
        }
        System.out.println("минимальное значение элемента: " + array1[0]);
        System.out.println("максимальное значение элемента: " + array1[array1.length-1]);
        System.out.println("срднее арефметическое: " + average);

    }
}
