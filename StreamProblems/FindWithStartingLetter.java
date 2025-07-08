package CollectionStreamAndCollectors.StreamProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindWithStartingLetter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Hamza", "Ahmed", "Bilal");
        Optional<String> startsWithA = names.stream().filter(name -> name.toLowerCase().startsWith("a")).findFirst();

        startsWithA.ifPresentOrElse(
                name -> System.out.println("Name starts with A is : " + name),
                ()-> System.out.println("Not found"));
    }
}
