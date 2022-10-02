package Homework05;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        //Создайте массив из чётных чисел [2;20]
        // и выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)
        int [] myArray = new int [10];
        myArray [0] = 2;
        for (int arrIndex = 1; arrIndex < myArray.length; arrIndex++) {
            myArray [arrIndex] = myArray[arrIndex-1] + 2;
        }
        for (int i = 0; i < myArray.length / 2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(myArray));
    }
}
