package Homework03;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //Программа загадывает число в диапазоне [1;9]
        //Пользователь вводит число с клавиатуры
        //Программа в зависимости от введенного числа выводит в консоль следующее:
        //"загаданное число больше"
        //"загаданное число меньше"
        //"Вы угадали" (программа завершает работу)
        //Если введен 0, выввести "выход из программы" (программа завершает работу)
        //Math.random() * (b-a) ) + a
        int number = 1 + (int) (Math.random() * 8);
        System.out.println("Введите число в диапазоне [1;9]");
        Scanner console = new Scanner(System.in);
        int userNumber = console.nextInt();
        while (userNumber != number) {
            if (userNumber == 0) {
                System.out.println("Выход из программы");
                break;
            } else if (userNumber > number) {
                System.out.println("Загаданное число меньше, введите новое число");
                userNumber = console.nextInt();
            } else if (userNumber < number) {
                System.out.println("Загаданное число больше, введите другое число");
                userNumber = console.nextInt();
            } else if (userNumber == number) {
                System.out.println("Вы угадали! Загаданное число:" + number);
                continue;

            }

        }

    }

}
