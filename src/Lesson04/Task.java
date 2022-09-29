package Lesson04;

public class Task {
    public static void main(String[] args) {
        // new string() используем, толбко когда не можем использоват ""
        // строка - ссылочный тип
        // строки неизменны, можно ли создат лишь новую на основе предыдущей
        String string1 = "чтрочка";
        String string2 = "строчка";
        //String string2 = new string ("Строчка");
        // все ссылочные типы храняться хип\куча область
        //пул строк
        // неьлзя сравнивать через ==, тк смотрит на переменные и они указывают на одну област
        // интерирование строк
        String internString = string2.intern(); // этот метод отдает значение в пул строк
        // сравнение строк
        System.out.println(string1.equals(string2));//регистрозависимое сравнение
        System.out.println(string1.equalsIgnoreCase(string2));//без учета регистра
        // конкатенация (приклеивание)
        String string3 ="Java";
        String string4 = "Gava";
        String contactString = string3 + " : : " + string4;
        System.out.println(contactString);

        contactString = string3.concat("::").concat(string4);
        System.out.println(contactString);
    }
}
