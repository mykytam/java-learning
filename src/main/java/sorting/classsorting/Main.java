package sorting.classsorting;

import sorting.basicsorting.MyUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Song> musicList = new ArrayList<>();
        musicList.add(new Song("Take on me", "A-ha", 1900));
        musicList.add(new Song("See you again", "Wiz Khalifa", 2014));
        musicList.add(new Song("Take on her", "Pillz", 2013));
        musicList.add(new Song("Just a gream", "Nelly", 2000));
        musicList.add(new Song("Irgendwann", "Nena", 2009));

        MyUtil.iterateList(musicList);
        Collections.sort(musicList);
        System.out.println("After sorting...");
        MyUtil.iterateList(musicList);
    }
}



