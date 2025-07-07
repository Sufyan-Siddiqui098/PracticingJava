package CollectionPractice;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Orange", "Apple", "Orange", "Orange", "Orange", "Peach");

        Set<String> distinctElement = new LinkedHashSet<>(list);
        System.out.println(distinctElement);

    }
}
