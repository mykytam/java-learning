package regex;

import java.util.regex.Pattern;

public class CharacterExample {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[xyz]", "wbcd")); // false (not x or y)
        System.out.println(Pattern.matches("[xyz]", "x")); // true
        System.out.println(Pattern.matches("[xyz]", "xxyyyyyyz")); // false (x & y more than one)
    }
}
