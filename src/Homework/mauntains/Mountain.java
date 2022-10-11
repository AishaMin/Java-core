package Homework.mauntains;

public class Mountain {
    //Гора создаётся с названием (не менее 4 символов), страной (не менее 4 символов) и высотой (не менее 100 метров)
    private String name;
    private String countryName;
    private int height;

    public Mountain(String name, String countryName, int height){
        if (name == null || name.length() < 4){
            throw new IllegalArgumentException("Название горы должно быть не менее четырех символов");
        }
        if (countryName == null || countryName.length() < 4){
            throw new IllegalArgumentException("Название страны должно быть не менее четырех символов");
        }
        if (height < 100){
            throw new IllegalArgumentException("Высота горы не должна быть менее ста метров");
        }

        this.name = name;
        this.countryName = countryName;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", countryName='" + countryName + '\'' +
                ", height=" + height +
                '}';
    }
}
