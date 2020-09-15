import java.util.Arrays;
import java.util.OptionalInt;

public class Exercise_13 {
    public static void main(String[] args) {
//        Создать последовательность случайных чисел, найти и вывести наибольшее
//        из них.

        int numbers[] = new int[10];
        int max = numbers[0];

        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
            System.out.print(numbers[i] + " ");
        }
        for (int i = 1; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);

        }

        System.out.println("\n" + "Максимальное значение  - " + max);


    }

}


