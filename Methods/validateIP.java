package Tasks;

import java.util.regex.Pattern;

public class validateIP {
    //является ли строка ip адресом

       public static void validateIP(String ipStr) {
        String regex = "\\b((25[0–5]|2[0–4]\\d|[01]?\\d\\d?)(\\.)){3}(25[0–5]|2[0–4]\\d|[01]?\\d\\d?)\\b";
        System.out.println(ipStr + " is valid? " + Pattern.matches(regex, ipStr));
    }
   public static void main(String[] args) {

        String ipStr1 = "255.245.188.123"; // valid IP address
        String ipStr2 = "255.245.188.273"; // invalid IP address - 273 is greater than 255

        validateIP(ipStr1);
        validateIP(ipStr2);
    }
}
