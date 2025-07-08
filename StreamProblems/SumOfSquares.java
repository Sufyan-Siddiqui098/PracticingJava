package CollectionStreamAndCollectors.StreamProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfSquares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 5, 6, 7, 8);
        Optional<Integer> sumOfSquareNumbers = numbers.stream().map(num -> num * num).reduce(Integer::sum);
        System.out.println(sumOfSquareNumbers.get());

    }
}
