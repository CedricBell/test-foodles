import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Main Class
 */
public class MainClass {

    public static List<Map.Entry<String, Integer>> getSortedFrequencyList(String sentence, int size) {

        System.out.println("sentence : " + sentence);
        System.out.println("size : " + size);
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] splitSentence = sentence.split(" ");
        for (int i = 0; i < splitSentence.length; i++) {
            if (splitSentence[i].length() > 0) {
                if (hashMap.containsKey(splitSentence[i])) {
                    hashMap.put(splitSentence[i], hashMap.get(splitSentence[i]) + 1);
                } else {
                    hashMap.put(splitSentence[i], 1);
                }
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(hashMap.entrySet());
        // The CustomComparator class is implemented in an other file and is sorting
        // elements in the hashmap by decreasing frequency and alphabetical order in
        // case of tie.
        Collections.sort(list, new CustomComparator<String, Integer>());
        list = list.stream().limit(size).collect(Collectors.toList());

        return list;
    }

    public static void main(String[] args) {
        String sentence = "baz bar foo foo zblah zblah zblah baz toto bar";
        int size = 3;
        List<Map.Entry<String, Integer>> res = getSortedFrequencyList(sentence, size);
        System.out.println(res);
    }

}
