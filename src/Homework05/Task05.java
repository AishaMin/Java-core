package Homework05;


import java.util.Arrays;

public class Task05 {
    public static void main(String[] args) {
        //Задать массив. Отрицательные элементы массива перенести в новый массив.
        // Размер массива должен быть равен количеству отрицательных элементов.
        int [] arrayAll = {1, 55, -200, 34, -99, 43, -66, 66, 77};
        int negative = 0;
        for (int arrIndex = 0; arrIndex < arrayAll.length; arrIndex++) {
            if (arrayAll [arrIndex] < 0){
                negative++;
            }

        }
        int [] arrayNegative = new int[negative];
        int count = 0;
        for (int arrIndex = 0; arrIndex<arrayAll.length; arrIndex++) {
            if (arrayAll[arrIndex] < 0)
                arrayNegative[count++] = arrayAll[arrIndex];
        }
        System.out.println(Arrays.toString(arrayNegative));
    }

}