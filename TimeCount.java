import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TimeCount {
    // private int timeStart;
    //  private int timeFinish;
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

    void printTimeCountInfo() {
        System.out.println(sec + " seconds " + min + " minutes " + hour + " hour");
    }


    int totalSec() {
        return (hour * 60 + min) * 60 + sec;
    }

    public void equal() {
        if (totalSec() < 0) {
            System.out.println("Please, enter correct time");
        } else {
            System.out.println(totalSec());
        }
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int total) {
        this.hour = total/60/60;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int total) {
        this.min = (total - sec%60)/60;
        ;
    }

    public int getSec(){
        return sec;
    }

    public void setSec(int total) {
        this.sec = total%60;
        ;
    }

    public static void main(String[] args) {
        TimeCount Start = new TimeCount(26, 25, 1);
        TimeCount Finish = new TimeCount(26, 25, 2);
        Start.printTimeCountInfo();
        Finish.printTimeCountInfo();
        int total = Finish.totalSec() - Start.totalSec();

        System.out.println("Промежуток времени составляет " + total + " секунд," + " что составляет " + "");

        System.out.println(Start.equals(Finish));




    }
}

//   Создать класс и объекты описывающие промежуток времени. Сам промежуток
//    в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//    Сделать методы для получения полного количества секунд в объекте, сравнения
//    двух объектов. Создать
//    два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//    по отдельности. Сделать метод для вывода данных.