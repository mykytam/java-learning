package exceptions;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class RectangleAreaException {
    public static void main(String[] args) {

        int result = 0;

        try{
            result = getAreaValue(-1, 100);
        }catch(IllegalArgumentException e){
            Logger.getLogger(RectangleAreaException.class.getName()).log(new LogRecord(Level.WARNING, "An argument with a negative value was passed to the area calculation method!"));
            throw e;
        }
        System.out.println("Result is : "+result);
    }

    public static int getAreaValue(int x, int y){
        if(x < 0 || y < 0) throw new IllegalArgumentException("value of 'x' or 'y' is negative: x="+x+", y="+y);
        return x*y;
    }
}
