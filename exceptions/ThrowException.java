package exceptions;

public class ThrowException {
    static void avg() throws ArithmeticException
    {
        System.err.println("Inside the function");
        throw new ArithmeticException("Demo");
    }

    public static void main (String args[]) {
        try { avg(); }
        finally {  System.err.println("Caught");}
    }
}

