package Homework02;

public class Task04 {
    public static void main(String[] args) {
        //Самостоятельно разобрать как работает Math.random() и написать код, который будет проверять попало ли
        // случайно сгенерированное целое число из отрезка [10;500] в интервал (25;200) и выводить результат в консоль.
        //Примеры работы программы:
        //Число 345 не содержится в интервале (25;200)
        //Число 110 содержится в интервале (25;200)
        //Math.random() * (b-a) ) + a
        int number =10 + (int) (Math.random() * 491);
        //В случае, если вещественное число, и верхний диапазон включает b - [a;b] :
        //( Math.random() * (b - a + 1) + a
        //Если еще и только целые числа:
        //(int)(( Math.random() * (b - a + 1) + a)
        if (number > 25 && number < 200) {
            System.out.println("Число "+number+" содержится в интервале (25;200)");
        } else System.out.println("Число "+number+" не содержится в интервале (25;200)");

    }
}