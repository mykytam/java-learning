package sorting.comparatorinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoClass {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(305);
        values.add(998);
        values.add(774);
        values.add(236);
        values.add(881);

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%100 > o2%100) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(values, com);


        for (int i : values) {
            System.out.println(i);
        }
    }
}
