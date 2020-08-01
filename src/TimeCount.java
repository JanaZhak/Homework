import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.Time;

public class TimeCount {

    private int hour;
    private int min;
    private int sec;

    public TimeCount() {
    }

    public TimeCount(int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;

    }

    public TimeCount(int seconds) { //конструктор, получающий  часы, минуты и секунды
//    по отдельности.
        sec = seconds % 60;
        min = (seconds % 3600) / 60;
        hour = seconds / 3600;
    }

   // public TimeCount(int hour, int min, int sec) { // конструктор, получающий общее кол-во секунд
   // sec =  (hour * 60 + min) * 60 + sec;

   // }


    void printTimeCountInfo() {
        System.out.println(sec + " second(s) " + min + " minute(s) " + hour + " hour(s)");
    }//метод для вывода данных


    int totalSec() {
        return (hour * 60 + min) * 60 + sec;
    } // метод для получения полного количества секунд в объекте

    public void equal() { //метод сравнения двух объектов
        if (totalSec() < 0) {
            System.out.println("Please, enter correct time");
        } else {
            System.out.println(totalSec());
        }
    }


    public static void main(String[] args) {
        TimeCount Start = new TimeCount(26, 25, 1);
        TimeCount Finish = new TimeCount(27, 26, 2);
        Start.printTimeCountInfo();
        Finish.printTimeCountInfo();
        int seconds = Finish.totalSec() - Start.totalSec();
        System.out.println(Start.equals(Finish));
        System.out.print("Промежуток времени составляет " + seconds + " секунд," + " что составляет " + "");


        TimeCount Seconds = new TimeCount(seconds);
        Seconds.printTimeCountInfo();


    }
}


//   Создать класс и объекты описывающие промежуток времени. Сам промежуток
//    в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//    Сделать методы для получения полного количества секунд в объекте, сравнения
//    двух объектов. Создать
//    два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//    по отдельности. Сделать метод для вывода данных.