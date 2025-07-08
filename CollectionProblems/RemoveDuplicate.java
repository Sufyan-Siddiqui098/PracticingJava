package CollectionStreamAndCollectors.CollectionProblems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Orange", "Apple", "Orange", "Orange", "Orange", "Peach");

        Set<String> distinctElement = new LinkedHashSet<>(list);
        System.out.println(distinctElement);

    }
}
