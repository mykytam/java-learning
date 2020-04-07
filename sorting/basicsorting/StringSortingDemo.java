package sorting.basicsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSortingDemo {
    public static void main(String[] args) {
        List<String> musicList = new ArrayList<>();
        musicList.add("rock");
        musicList.add("pop");
        musicList.add("rockNroll");
        musicList.add("rap");
        musicList.add("jazz");

        MyUtil.iterateList(musicList);

        System.out.println("Sorting...");
        Collections.sort(musicList);

        MyUtil.iterateList(musicList);
    }
}
