package functional.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    static Function<Integer, Integer> incrementBy1Function =
            number -> number + 1;
    static Function<Integer, Integer> multiplyBy10Function =
            number -> number * 10;
    static Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
            incrementBy1Function.andThen(multiplyBy10Function);
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numToIncrementByOne, numToMultiplyBy) -> (numToIncrementByOne + 1) * numToMultiplyBy;

    public static void main(String[] args) {
        // Function takes 1 argument and produces 1 result
        System.out.println(incrementByOne(1));
        System.out.println(incrementBy1Function.apply(1));
        System.out.println(multiplyBy10Function.apply(2));
        System.out.println(addBy1AndThenMultiplyBy10.apply(5));

        // BiFunction takes 2 argument and produces 1 result
        System.out.println(incrementByOneAndMultiply(4, 100));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));

    }

    static int incrementByOne(int number) {
        return number + 1;
    }

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
