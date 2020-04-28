package regex;

import java.util.regex.Pattern;

public class MetacharExample {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("d", "abc")); // false
        System.out.println(Pattern.matches("d", "1")); // true
        System.out.println(Pattern.matches("d", "456c")); // false

        System.out.println(Pattern.matches("D+", "abc")); // true
        System.out.println(Pattern.matches("D", "1")); // false
        System.out.println(Pattern.matches("D", "m")); // true

        System.out.println(Pattern.matches("D*", "abc")); // true
    }
}
