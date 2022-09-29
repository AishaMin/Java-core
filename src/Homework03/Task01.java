package Homework03;
import java.util.Scanner; // без этого не работало. что еще нужно знат из таких штук?

public class Task01 {
    public static void main(String[] args) {
        //Задача на WHILE
        //Считать с консоли количество тарелок и моющего средства.
        //Моющее средство расходуется из расчета 0.5 на 1 тарелку (за один раз расходуется 0.5 стредства и 1 тарелка).
        //В цикле выводить сколько моющего средства осталось после мытья каждой тарелки.
        //После цыкла вывести сколько тарелок и моющего средства осталось.

            System.out.println("Введите количество тарелок и моющего средства");
            Scanner console = new Scanner(System.in);
            int plates = console.nextInt();
            float detergent = console.nextFloat();

            while(plates > 0 && detergent > 0.0F) {
                --plates;
                detergent = (float)((double)detergent - 0.5);
                System.out.println("Осталось моющего средства: " + detergent);
            }

            System.out.println("Тарелок:" + plates + " средства:" + detergent);

    }
}
