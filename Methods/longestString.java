package Tasks;

public class longestString {
    //напишите метод для поиска самой длинной строки в массиве

    public static String findLongestString(String[] words) {
        int size = words.length;
        String longestWord = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;

    }

    public static void main(String[] args) {
        String[] words = {"мне", "не", "нравится", "как", "пишется", "бяка"};
        String result = findLongestString(words);
        System.out.println(result);
    }
}














