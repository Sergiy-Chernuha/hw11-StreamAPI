package global.goit;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCombiner {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> list1 = first.collect(Collectors.toList());
        List<T> list2 = second.collect(Collectors.toList());
        int minLength = (Math.min(list1.size(), list2.size()));

        return IntStream.range(0, minLength)
                .mapToObj(i -> Stream.of(list1.get(i), list2.get(i)))
                .flatMap(x -> x);
    }
}
