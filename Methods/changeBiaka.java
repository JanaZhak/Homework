package Tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class changeBiaka {

    public static void main(String[] args) {
        String string = "странное слово бяка и зачем эту бяка вырезать";
        String replaceString = string.replaceAll("бяка", "[вырезано цензурой]");
        System.out.println(replaceString);
    }
}
