package Homework03;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //Пользователь загадывает число в диапазоне от [2 до 100]
        //Программа пытается его угадать (используйте метод бинарного поиска, т.е деление отрезка на 2).
        //Программа может задавать пользователю вопросы: Число равно ...?, Число больше ...?
        // и в зависимоти от ответа пользователя принимать решения.
        //Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА

        //на просторах интернета: (поняла, как работает бинарный поиск, не поняла как связат все в наши условия
        int min = 0;
        int max = 100;
        int midrange = Math.round((min + max) / 2); // округление чисел
        String strInput = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Загадайте число от 0 до 100!\n" +
                "Чтобы продолжить, введите любое значение:");
        strInput = scan.nextLine();

        while (!strInput.equals("=")) {
            System.out.println("Это число больше, меньше или равно " + midrange + "? " +
                    "Введите '+' если больше, '-' если меньше и '=' если равно:");
            strInput = scan.nextLine();
            if (strInput.equals("=")) {
                System.out.println("Отлично! Ваше число " + midrange + ". Спасибо за игру ;)");
                break;
            } else if (strInput.equals("+")) {
                //уменьшаем диапазон:
                min = midrange;

                //находим новую середину диапазона:
                midrange = Math.round((min + max) / 2);

                //если округление сравнило середину с нижней границей, увеличиваем середину на 1:
                if (min == midrange && midrange != 100) {
                    midrange += 1;
                }
            } else if (strInput.equals("-")) {
                max = midrange;
                midrange = Math.round((min + max) / 2);
            }


        }
    }
}
