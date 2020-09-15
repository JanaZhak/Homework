import java.util.Arrays;
import java.util.OptionalInt;

public class Exercise_14 {
    public static void main(String[] args) {
//        Создать массив оценок произвольной длины, вывести максимальную и
//        минимальную оценку, её (их) номера.
        int numbers[] = {1, 2, 1, 3, 5, 4, 5, 2};
        int count = 0;
        int max = numbers[0];
        int min = numbers[0];
        int imax = 0;
        int imin = 0;
        for (int i = 0; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
            min = Math.min(min, numbers[i]);

            if (numbers[i] == max) {
                imax = i;
                if (numbers[i] == min)
                    imin = i;
                 }

    }
        System.out.println("Минимальная оценка " + min + " содержится в ячейке под номером " + imin);
        System.out.println("Максмальная оценка " + max + " содержится в ячейке под номером " + imax);}
}


// ?? к сожалению, так и не поняла, как показать номера ВСЕХ ячеек, содержащих макс/мин значения??





