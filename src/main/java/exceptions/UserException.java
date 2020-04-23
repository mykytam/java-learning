package exceptions;

public class UserException {
    public static void main(String[] args) {
    try { throw new MyException(5); }
    catch (Exception e) { System.out.println(e); }
    }
}
class MyException extends Exception {
    int a;
    MyException(int b) { a = b; }

    @Override
    public String toString() {
        return ("Exception number = " + a);
    }
}