package Homework.mauntains;
//В методе main (отдельного класса) создать:
//3 группы для восхождений на 3 различных горы.
//В первой группе 3 альпиниста (набор закрыт)
//Во второй и третьей группах по 2 альпиниста (набор в эти группы открыт)
public class Application {
    public static void main(String[] args) {
        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();
        group1.climberCount = 3;
        group2.climberCount = 2;
        group3.climberCount = 2;

        Mountain mountain1 = new Mountain("Ортлер","Италия", 3905 );
        Mountain mountain2 = new Mountain("Фудзияма", "Япония", 3776);
        Mountain mountain3 = new Mountain("Маналсу", "Гималайи", 8156);

        Climber climber1 = new Climber("Афанасий", "Спб 33 ворота гостинного двора");
        Climber climber2 = new Climber("Егор", "МСК 33 ворота гостинного двора");
        Climber climber3 = new Climber("Олег", "ЕКб 33 ворота гостинного двора");
        Climber climber4 = new Climber("Анастасия", " 33 ворота гостинного двора");
        Climber climber5 = new Climber("София", "Спб 33 ворота гостинного двора");
        Climber climber6 = new Climber("Мира", "третий круг ада");
        Climber climber7 = new Climber("Мария", "второй круг ада Данте");


    }
}
