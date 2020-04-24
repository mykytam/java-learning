package functional.functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("380") && phoneNumber.length() == 11;
    static Predicate<String> containsNumber3 =
            phoneNumber -> phoneNumber.contains("5");

    public static void main(String[] args) {
        // Usual Java Function
        System.out.println(isPhoneNumberValid("38095078941"));
        System.out.println(isPhoneNumberValid("38048945f8941"));
        // Predicate Function
        System.out.println(isPhoneNumberValidPredicate.test("38095078941"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("3804894f8941"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("3804894f894"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("380") && phoneNumber.length() == 11;
    }
}
