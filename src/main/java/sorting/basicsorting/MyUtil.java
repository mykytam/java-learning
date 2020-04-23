package sorting.basicsorting;

import java.util.List;

public class MyUtil {
    public static <T> void iterateList (List<T> anyList) {
        for (T temp : anyList) {
            System.out.println(temp + " ");
        }
    }
}
