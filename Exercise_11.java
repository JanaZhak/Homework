public class Exercise_11 {

    public static void main(String[] args) {
        //Имеется целое число, определить является ли это число простым, т.е.
        //делится без остатка только на 1 и себя.

        int k = 4;
        for (int i = 1; i <= 10; i++) {
            if ((k % k == 0) && (k / i == 1) && (k % i == 0)) {
                System.out.println("Число " + k + " является простым");
                i++;
                break;

            } else {
                System.out.println("Число " + k + " не является простым");
                break;

            }


        }
    }
}
