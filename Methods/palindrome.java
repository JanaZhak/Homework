package Tasks;

public class palindrome {
//напишите метод, который проверяет является ли слово палиндромом

    static boolean isPalindrome(String word) {
        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        String word = "как";
        if (isPalindrome(word))
            System.out.print("Слово " + word + " является палиндромом");
        else
            System.out.print("Слово " + word + " не является палиндромом");
    }
}

