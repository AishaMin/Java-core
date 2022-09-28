package Homework02;

public class Task03 {
    public static void main(String[] args) {
        //Дана целочисленная переменная count - количество верных ответов. В зависимости от значения этой
        //переменной вывести в консоль оценку: 100 - 90 правильных ответов - отлично 89 - 60 правильных ответов
        //- хорошо 59 - 40 правильных ответов - удовлетворительно 39 - 0 правильных ответов - попробуйте в следующий раз

        int count = 90;
        if (count <= 100 && count >= 90 ){
            System.out.println("Отлично");
        } else if (count <= 89 && count >= 60 ) {
            System.out.println("Хорошо");
        } else if (count <= 59 && count >= 40) {
            System.out.println("Удовлетворительно");
        } else System.out.println("Попробуйте в следующий раз");
    }
}
