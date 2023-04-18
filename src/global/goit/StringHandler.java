package global.goit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringHandler {
    public static String filteredOddElements(List<String> inputList) {
        List<String> result = new ArrayList<>(inputList);

        return IntStream.range(0, result.size())
                .filter(n -> n % 2 != 0)
                .mapToObj((x) -> String.format("%d. %s", x, result.get(x)))
                .collect(Collectors.joining(", ", "", "..."));
    }

    public static List<String> upperCaseSortedList(List<String> inputList) {
        List<String> result = new ArrayList<>(inputList);

        return result.stream().map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
