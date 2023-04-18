import global.goit.IntegerHandler;
import global.goit.StreamCombiner;
import global.goit.StringHandler;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ivan", "Peter", "Sergiy", "Yan", "Anton", "Boris");
//        ________first_________
        String filteredList = StringHandler.filteredOddElements(list);
        System.out.println(filteredList);
        System.out.println("_________________________");

//        _________second________
        List<String> upperCaseList = StringHandler.upperCaseSortedList(list);
        System.out.println(upperCaseList);
        System.out.println("_________________________");

//        ___________third_________
        String[] dualIntArray = new String[]{"1, 2, 0", "4, 5, 85, 15646"};
        IntegerHandler.printDoubleArray(dualIntArray);
        System.out.println("_________________________");

//        _____________fourth________
        Stream<Long> longStream = IntegerHandler.printRandomInteger(15, 25214903917L, 11, 2 ^ 48);
        longStream.forEach(System.out::println);
        System.out.println("_________________________");

//        _______________fiveth_________
        Stream<Long> longStream1 = IntegerHandler.printRandomInteger(15, 25214903917L, 11, 2 ^ 48);
        Stream<Long> longStream2 = IntegerHandler.printRandomInteger(5, 25, 11, 85);

        Stream<Long> zipStream = StreamCombiner.zip(longStream1, longStream2);

        zipStream.forEach(System.out::println);
        System.out.println("_________________________");
//       ________________________________
        List<String> stringList1 = Arrays.asList("Ivan", "Peter", "Sergiy", "Yan", "Anton", "Boris");
        List<String> stringList2 = Arrays.asList("engineer", "writer", "driver");

        Stream<String> zipStringStream = StreamCombiner.zip(stringList1.stream(), stringList2.stream());
        zipStringStream.forEach(System.out::println);
    }
}
