public class Exercise_15 {
    public static void main(String[] args) {
//        Создать массив, заполнить его случайными элементами, распечатать,
//        перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//        еще один массив).


        int mas[] = new int[10];
        for(int i = 0;i < mas.length;i++){
            mas[i] = (int)(Math.random()*10);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for(int i = mas.length - 1;i >= 0;i--){
            System.out.print(mas[i] + " ");
        }
            }

        }
