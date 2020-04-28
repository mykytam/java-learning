package regex;

import java.util.regex.Pattern;

public class Quant {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[ayz]?", "a")); // true
        System.out.println(Pattern.matches("[ayz]?", "aaaa")); // false
        System.out.println(Pattern.matches("[ayz]?", "ayyyyzzz")); // false
        System.out.println(Pattern.matches("[ayz]?", "amnta")); // false

        System.out.println(Pattern.matches("[ayz]+", "a")); // true
        System.out.println(Pattern.matches("[ayz]+", "aaa")); // true
        System.out.println(Pattern.matches("[amn]+", "ayyyzz")); // true

        System.out.println(Pattern.matches("[ayz]*", "ayyyza")); // true
    }
}
