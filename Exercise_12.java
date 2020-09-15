public class Exercise_12 {
    public static void main(String[] args) {

        int n = 3;
        int k = 1;
        for (int i = 1; k <= n; i++) {
            if (i % 3 == 0) {
                System.out.println("\n" + i); //вычсление числа,кратного 3
                System.out.println("сумма числел "+ (i+i));
                k++;


            }
        }

    }
}