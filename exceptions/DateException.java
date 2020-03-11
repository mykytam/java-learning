package exceptions;
import  java.util.*;
import java.text.SimpleDateFormat;

public class DateException {
    static void convertDateFormat(String inputDate) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
            Date date = sdf.parse(inputDate);
            SimpleDateFormat outputsdf = new SimpleDateFormat("yyyy-MM-dd");
            String outputDate = outputsdf.format(date);
            System.out.println("After changing date format to yyyy/MM/dd: " + outputDate);
        } catch (java.text.ParseException e) {
            System.err.println("Some error occurred while converting date formats. Exception is: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date in format dd/MM/yyyy");
        String inputDate = scanner.nextLine();
        convertDateFormat(inputDate);
    }
}
