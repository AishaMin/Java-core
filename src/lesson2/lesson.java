package lesson2;

public class lesson {
    public static void main(String[] args) {
       /*  int sum = 111000;
         double res = sum > 100000 ? sum*0.9 : sum;
        System.out.println(res);
    }*/
        // switch в стиле лямбда выпажений
        int age = 2;

        int count = switch (age) {
            case 0, 1 -> 200;    // способен возвращать результат работы
            case 2, 3 -> 150;
            case 4, 5 -> 100; // не должно быть вывода в консоль, тк так не сможет вернуть значение, поэтому же и не раюоотает без дефолта
            default -> 0; // нужен если присваиваем значение
        }; // нужна ; тк присваивается значение
        System.out.println(count);

        count = switch (age) {
            case 0, 1 -> {
                System.out.println("Результат на 0 - 1 год: " + 200);
                yield 200;
            } // если нужно несклько инструкций, то нужнф {}, изза них же и не вернет значение
            case 2, 3 -> {
                System.out.println("Результат на 2 - 3 года: " + 150);
                yield 150; // для этого нужен он! он все решит и вернет результат
            }
            case 4, 5 -> {
                System.out.println("Результат на 4 - 5 лет: " + 100);
                yield 100;
            }
            default -> {
                System.out.println("Результат для собаки старше 5 лет: " + 0);
                yield 100;
            }
        };
        System.out.println(count);
// блок фигурных скобок
        int k =1;{
            int l =2;
            System.out.println(k);
            System.out.println(l);
        }
        //System.out.println(l);
        //область видимости локальных переменных это блок фигурных скобок, снаружи ее не существует

    }
    }


