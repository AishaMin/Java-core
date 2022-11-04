package Homework.mauntains;

import java.util.Arrays;

public class Group {
    //Группа для восхождения на гору создаётся со следующими характеристиками и возможностями:
    //идёт набор в группу или нет;
    //массив альпинистов;
    //гора;
    //должна быть возможность добавить альпиниста в группу, если набор ещё идёт
    private int group; //количество человек
    private Climber arrayClimbers[];
    public int climberCount = 3;
    private boolean recruitedGroup;
    private Mountain mountain;

    public void setMountain(Mountain mountain) {
        if (mountain == null){
            throw new IllegalArgumentException("Гора не может быть null");
        }
        this.mountain = mountain;
    }

    public void setClimberCount(int climberCount) {
        if (climberCount < 0 || climberCount > 3){
            throw new IllegalArgumentException("количество альпинистов не может быть меньше нуля, " +
                    "а так же в группе не может быть больше трех участников");
        } else if (climberCount < 3){
            recruitedGroup = false; // группа не закрыта
        } else
            recruitedGroup = true;
        this.climberCount = climberCount;
    }

    public void arrayClimbers (Climber climber){
        for (int i = 0; i < arrayClimbers.length; i++) {
            if (arrayClimbers[i] == null){
                arrayClimbers[i] = climber;
            }
        }
        recruitedGroup = true;
        System.out.println("Группа закрыта");
    }

    @Override
    public String toString() {
        return "Group{" +
                "group=" + group +
                ", arrayClimbers=" + Arrays.toString(arrayClimbers) +
                ", climberCount=" + climberCount +
                ", recruitedGroup=" + recruitedGroup +
                ", mountain=" + mountain +
                '}';
    }
}
