package generics.genericsonmethods;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    public int compare(final Person left, final Person right) {
        return -1 * Integer.compare(left.getAge(), right.getAge());
    }
}
