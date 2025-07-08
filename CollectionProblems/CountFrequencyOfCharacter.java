package CollectionStreamAndCollectors.CollectionProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequencyOfCharacter {
    public static void main(String[] args) {
        String sentence = "Hi this is Sufyan Hello";
        Map<Character, Integer> charFreq = new HashMap<>();

        for(char c : sentence.toCharArray()){
            charFreq.put(c, charFreq.getOrDefault(c, 0)+1);
        }

//        System.out.println(Stream.
//                of(charFreq)
//                .filter(x -> x.remove(' ', x.get(' ')))
//                .collect(Collectors.toCollection(new TreeMap<Character, Integer>()))
//
//        );
        System.out.println(charFreq);
        List<Map.Entry<Character, Integer>> mapList = new ArrayList<>(charFreq.entrySet());
        mapList.sort((e1, e2 ) -> e2.getKey().compareTo(e1.getKey()));

        System.out.println(mapList);

    }
}
