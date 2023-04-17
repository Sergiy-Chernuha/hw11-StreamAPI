package global.goit;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerHandler {
    public static void printDoubleArray(Integer[][] inputArray) {
        String result = Arrays.stream(inputArray)
                .flatMap(Arrays::stream)
                .sorted()
                .map((x) -> "" + x)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }

    public static Stream<Long> printRandomInteger(Integer startInt, long a, int c, long m) {
        return Stream
                .iterate((long) startInt, (n) -> 1 * (a * n + c) % m)
                .limit(10);
    }
}
