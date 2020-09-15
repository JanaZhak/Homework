public class Exercise_16 {
    public static void main(String[] args) {
//        Определите сумму элементов одномерного массива, расположенных между
//        минимальным и максимальным значениями.
        int numbers [] = {3,2,1,5,4,};
        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
            min = Math.min(min, numbers[i]);}

        for (int i = 0; i < numbers.length; i++){
            if ( numbers[i]>min && numbers[i] < max ){
              //  System.out.println(numbers[i]);
            sum += numbers[i];
            }

        }System.out.println("Минимальное значение "+ min + ", максимальное значение " + max);
        System.out.println("Сумма элементов одномерного массива между min и max равна " + sum);

    }
}

