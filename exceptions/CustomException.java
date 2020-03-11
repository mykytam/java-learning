package exceptions;
import java.util.*;

public class CustomException {
    static void validateInput (int number) throws InvalidInputException{
        if(number > 100)
        {
            throw new InvalidInputException("Exception");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number less then 100: ");
        int number = scanner.nextInt();
        try {
            validateInput(number);
        } catch (InvalidInputException e) {
            System.err.println("Caught exception - input is greater than 100");
        } finally {
            System.out.println("The program is completed");
        }
    }


}

class InvalidInputException extends Exception{
    InvalidInputException(String exceptionText) {
        super(exceptionText);
    }
}