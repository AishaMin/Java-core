package Homework02;

public class Task01 {
    public static void main(String[] args) {
        // Дан номер месяца, например int month = 5. В зависимости от данного значения вывести в консоль время года
        int month = 5;
        if  ((month < 3 )|| (month == 12)){
            System.out.println("Зима");
        } else if ((month > 2 ) && ( month < 6)) {
            System.out.println("Весна");
        } else if ((month > 5 ) && (month < 9)) {
            System.out.println("Лето");
        } else if ((month > 8) && (month < 12)) {
            System.out.println("Осень");
        }


    }
}
