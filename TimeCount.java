public class TimeCount {

    private int hour;
    private int min;
    private int sec;

    public TimeCount() {
    }

    public TimeCount(int sec, int min, int hour) {   
        if (sec < 0 || min < 0 || hour < 0) {
            System.out.println("Please, enter correct time");
        } else {
            this.sec = sec;
            this.min = min;
            this.hour = hour;
           
        }
    }

    public TimeCount(int seconds) { //конструктор, получающий  часы, минуты и секунды по отдельности
        if (seconds < 0) {
            System.out.println("Please, enter correct time");
        } else
            hour = seconds / 3600;
        min = (seconds - hour * 3600) / 60;
        sec = seconds - hour * 3600 - min * 60;
    }

    // public TimeCount(int hour, int min, int sec) {  // конструктор, получающий общее кол-во секунд
    // sec =  (hour * 60 + min) * 60 + sec;
    // }


    void printTimeCountInfo() {  //метод для вывода данных

        System.out.println(sec + " second(s) " + min + " minute(s) " + hour + " hour(s)");
    }


    int totalSec() {   // метод для получения полного количества секунд в объекте

        return (hour * 60 + min) * 60 + sec;
    }

//   public boolean equal(finish, TimeCount start) { //  ????? метод сравнения двух объектов ????
//                if (start.totalSec() == finish.totalSec()) {
//            return true;}
//                else{
//                    return false;}


    public static void main(String[] args) {
        TimeCount start = new TimeCount(25, 27, 1);
        TimeCount finish = new TimeCount(8906);
        start.printTimeCountInfo();
        finish.printTimeCountInfo();
        int seconds = finish.totalSec() - start.totalSec();
        System.out.println(start.equals(finish));
        if (seconds < 0) {
            System.out.println("Please, enter correct time");
        } else {
            System.out.print("Промежуток времени составляет " + seconds + " секунд," + " что составляет " + "");
        }


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
