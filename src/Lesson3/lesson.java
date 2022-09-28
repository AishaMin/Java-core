package Lesson3;

import java.util.Scanner;

public class lesson {
    public static void main(String[] args) {
        // инкремент c++ и декремент c-- (операторы)
        Scanner in = new Scanner(System.in);
        System.out.println("введите целое число" );
        int UserNumber = in.nextInt();
        System.out.println(UserNumber*UserNumber);

        int printsCount = 3;
        while (printsCount > 0) {//тело цикла
            System.out.println("=====");
            printsCount --; //итерация - количество выполнения цикла
            // printsCount -= 1;
            //printsCount = printsCount - 1;
    }

}}
