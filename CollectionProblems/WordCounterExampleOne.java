package CollectionStreamAndCollectors.CollectionProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class WordCounterExampleOne {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple", "Banana", "Orange", "Apple", "Orange", "Orange", "Orange", "Peach");
        System.out.println(listToMap(list));

        System.out.println("---------- By using Stream -------");
        System.out.println(list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())));
    }

    public static HashMap<String, Integer> listToMap(List<String> list) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        list.forEach(item -> {

            int count = 0;
            for(int i = 0; i<list.size(); i++){
                if(item.equals(list.get(i))){
                    count++;
                }
            }

            hashMap.put(item, count);

        });
        return  hashMap;
    }

}
