import java.sql.Time;

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
        System.out.println(sec + "seconds " + min + " minutes " + hour + " hour");
    }

    //int TimeBetween() {
    //    return
    // }
   int totalSec() {
      return (hour * 60 + min) * 60 + sec;
   }

    // int Reduction() {
    //       return sec = totalSec % 60;
    //    return min = (totalSec - sec) / 60;
    //   return  hours = (min - (min%60)) / 60;
//    }

//}
//
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public static void main(String[] args) {
        TimeCount Start = new TimeCount(26, 25, 1);
        TimeCount Finish = new TimeCount(26, 25, 2);
        Start.printTimeCountInfo();
        Finish.printTimeCountInfo();
        int total  = Finish.totalSec() - Start.totalSec();
        System.out.println("Промежуток времени составляет " +  total + " минут" + "или" + "");
        System.out.println(Start.totalSec());
        System.out.println(Finish.totalSec());





    }
}

