package lambdasAndStreams.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainBuildingStreams {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4);

        Stream<Integer> stream = ints.stream();
        Stream<Integer> stream1 = Stream.of(0, 1, 2, 3, 4);
        stream.forEach(System.out::println);
        stream1.forEach(System.out::println);

        Stream<String> stringStream = Stream.generate(() -> "one");
        stringStream.limit(5).forEach(System.out::println);

        Stream<String> stringStream2 = Stream.iterate("+", s -> s + "+");
        stringStream2.limit(7).forEach(System.out::println);

        IntStream intStream = ThreadLocalRandom.current().ints();
        intStream.limit(4).forEach(System.out::println);
    }
}
