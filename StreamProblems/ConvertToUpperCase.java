package CollectionStreamAndCollectors.StreamProblems;

import java.util.Arrays;
import java.util.List;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Hamza", "Ahmed", "Bilal");
        List<String> upperCaseName = names.stream().map(String::toUpperCase).toList();

        System.out.println("List of names before operation : " + names);

        System.out.println("List of names after operation : " + upperCaseName);
    }
}
