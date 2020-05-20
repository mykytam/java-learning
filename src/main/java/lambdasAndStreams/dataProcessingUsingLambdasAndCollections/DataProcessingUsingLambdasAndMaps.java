package lambdasAndStreams.dataProcessingUsingLambdasAndCollections;

import java.util.*;

public class DataProcessingUsingLambdasAndMaps {
    public static void main(String[] args) {
        Person p1 = new Person("Julia", 23);
        Person p2 = new Person("Brian", 58);
        Person p3 = new Person("Chelsea", 46);
        Person p4 = new Person("David", 28);
        Person p5 = new Person("Erica", 37);
        Person p6 = new Person("Ivan", 18);

        City newYork = new City("New York");
        City berlin = new City("Berlin");
        City paris = new City("Paris");

        Map<City, List<Person>> map = new HashMap<>();

        map.putIfAbsent(paris, new ArrayList<>());
        map.get(paris).add(p1);

        map.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p2);
        map.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p3); // lambda expression will not be executed

        System.out.println("People from Paris: " + map.getOrDefault(paris, Collections.EMPTY_LIST));
        System.out.println("People from New York: " + map.getOrDefault(newYork, Collections.EMPTY_LIST));

        //creating two maps

        Map<City, List<Person>> map1 = new HashMap<>();
        map1.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p1);
        map1.computeIfAbsent(berlin, city -> new ArrayList<>()).add(p2);
        map1.computeIfAbsent(paris, city -> new ArrayList<>()).add(p3);

        System.out.println("Map1");
        map1.forEach(((city, people) -> System.out.println(city + ": " + people)));

        Map<City, List<Person>> map2 = new HashMap<>();
        map2.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p4);
        map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p4);
        map2.computeIfAbsent(paris, city -> new ArrayList<>()).add(p5);

        System.out.println("Map2");
        map2.forEach(((city, people) -> System.out.println(city + ": " + people)));

        //merging

        System.out.println("Merged map");

        map2.forEach(
                (city, people) -> {
                    map1.merge(
                            city, people,
                            (peopleFromMap1, peopleFromMap2) -> {
                                peopleFromMap1.addAll(peopleFromMap2);
                                return peopleFromMap1;
                            });
                }
        );

        map1.forEach(
                ((city, people) -> System.out.println(city + ": " + people))
        );
    }
}