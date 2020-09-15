public class Exercise_9 {


    public static void main(String[] args) {
        int average = 0;
        int factorial = 1;
        int n = 0;
        int x = (int) (Math.random() * 20);

        System.out.println(x); //первое рандомное число
        System.out.println("");

        while (x != 0) {
            factorial *= x;     //factorial  = factorial * x
            n++; // счетчик кол-ва циклов = счетчик колличества созданных рандомных чисел
            x = (int) (Math.random() * 20);

            System.out.println("");
            System.out.println(n);
            System.out.println(x);


        }
        {
            System.out.println("произведение чисел: " + factorial);
        }
        if (n != 0) {
            average = factorial / n;
        } else {
            average = 0;
        }
        System.out.println("среднее:" + average);


    }

}