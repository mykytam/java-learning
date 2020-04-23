package sorting.basicsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSortingDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(15);
        integerList.add(8);
        integerList.add(3);
        integerList.add(4);
        integerList.add(-2);

        MyUtil.iterateList(integerList);

        System.out.println("Sorting...");
        Collections.sort(integerList);

        MyUtil.iterateList(integerList);
    }
}
