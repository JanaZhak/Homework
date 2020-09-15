package Tasks;

public class stringInString {

    public static void main(String[] args) {
       String lineOne = "abc";
       String[] lineTwo = {"abc", "Abc","abc","ABC","abc"};
       int count = 0;

        for(int i = 0; i < lineTwo.length; i++)
            if (lineTwo[i].equals(lineOne)) {
                count++;
            }
        System.out.println(count);
    }}
