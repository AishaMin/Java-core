package Homework.homework14.message;

import java.util.*;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритета
        //  Ответ в консоль
        int [] count = new int[MessagePriority.values().length];
        for (Message message : messageList){
            count [message.getPriority().ordinal()] += 1;
        }
        for ( MessagePriority priority : MessagePriority.values()) {
            System.out.println(priority + ": " + count[priority.ordinal()]);
        }
       /* правильно, но длинно
        for (Message message : messageList) {
            if (message.getPriority()==MessagePriority.LOW){
                count [0] += 1;
            } else if (message.getPriority() == MessagePriority.MEDIUM) {
                count [1] += 1;
            } else if (message.getPriority() == MessagePriority.HIGH) {
                count [2] += 1;
            } else count [3] += 1;
        }*/
    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        int [] counts = new int[10];
        for (Message message : messageList){
            counts[message.getCode()] += 1;
        }
        for (int i = 0; i < counts.length; i++){
            System.out.println("Код " + " встречается = " + counts[i]);
        }
    }

    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
        System.out.println("количество уникальных сообщений: " + new HashSet<>(messageList).size());
        //HashSet используется, тк туда не добавляются уже имеющиеся элементы
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        return new ArrayList<>(new LinkedHashSet<>(messageList));
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
        System.out.println("до удаления: " + messageList.size());
        Iterator<Message> iterator = messageList.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getPriority() == priority){
                iterator.remove();
            }
        }
        System.out.println("после удаления: " + messageList.size());
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
        System.out.println("до удаления: " + messageList.size());
        Iterator<Message> iterator = messageList.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getPriority() != priority){
                iterator.remove();
            }
        }
        System.out.println("после удаления: " + messageList.size());
    }

    public static void main(String[] args) {
        List<Message> messages = Message.generate(34);
        System.out.println(messages);
    }
}
