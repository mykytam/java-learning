package exceptions;

public class SampleException {
    public static void main (String[] args) {

        try {
            int a = 10, b = 0;
            int c = a/b;
            System.out.println("result="+c);
        } catch (ArithmeticException e) {
            System.err.println("Can't divide a number by zero");
        } finally {
            System.err.println("Finally is always  executed");
        }

        try {
            int number = Integer.parseInt("Integer");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.err.println("Number Format Exception");
        }

        try {
            int a[] = new int[5];
           a[7] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array index is out of bounds");
        }
    }
}
