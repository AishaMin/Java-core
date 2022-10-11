package Homework.mauntains;
//льпинист создаётся с именем (не менее 3 символов) и адресом проживания (не менее 5 символов).
public class Climber {
    private String name;
    private String address;

    public Climber(String name, String address){
        if (name == null || name.length() < 3){
            throw new IllegalArgumentException("Имя должно быть не менее трех символов");
        }
        if (address == null || address.length() < 5){
            throw new IllegalArgumentException("Адресс не должен быть менее пяти символов");
        }
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Climber{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
