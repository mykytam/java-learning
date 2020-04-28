package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter RegEx:");
                String regexPatter = sc.nextLine();
                Pattern pattern = Pattern.compile(regexPatter);
                Matcher matcher = pattern.matcher("Welcome to Youtube channel");
                boolean found = false;
                while (matcher.find()) {
                    System.out.println("found text "
                            + matcher.group() + " starting at index "
                            + matcher.start() + " ending at index "
                            + matcher.end());
                    found = true;
                }
                if (!found) {
                    System.out.println("No match");
                }
            }
        }
    }
}
