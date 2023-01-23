import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.Test;

public class TestClass {

    @Test
    public void testWithEmptySentence() {
        // Empty sentence
        String sentence = "";
        int size = 3;
        List<Map.Entry<String, Integer>> res = MainClass.getSortedFrequencyList(sentence, size);
        assertEquals(true, res.isEmpty());

    }

    @Test
    public void testWithNullSize() {
        // Size = 0
        String sentence = "baz bar foo foo zblah zblah zblah baz toto bar";
        int size = 0;
        List<Map.Entry<String, Integer>> res = MainClass.getSortedFrequencyList(sentence, size);
        System.out.println(res);
        assertEquals(true, res.isEmpty());
    }

    @Test
    public void testWithVeryLongSentence() {
        // Very Long Sentence
        String sentence = "baz bar foo foo zblah zblah zblah baz toto bar baz bar foo foo zblah zblah zblah baz toto bar baz bar foo foo zblah zblah zblah baz toto bar baz bar foo foo zblah zblah zblah baz toto bar baz bar foo foo zblah zblah zblah baz toto bar baz bar foo foo zblah zblah zblah baz toto bar baz bar foo foo zblah zblah zblah baz toto bar";
        int size = 1;
        List<Map.Entry<String, Integer>> res = MainClass.getSortedFrequencyList(sentence, size);
        System.out.println(res);
        assertEquals(res.get(0).getKey(), "zblah");
        assertEquals(res.get(0).getValue().intValue(), 21);

    }

    @Test
    public void testWithVeryLongSentenceAndSize() {
        // Very Long Sentence and Size
        String sentence = "test test2 test3 test4 test5 test6 test7 test8 baz bar foo foo zblah zblah zblah baz toto bar baz bar foo foo zblah zblah zblah baz toto bar baz bar foo foo zblah zblah zblah baz toto bar baz bar foo foo zblah zblah zblah baz toto bar baz bar foo foo zblah zblah zblah baz toto bar baz bar foo foo zblah zblah zblah baz toto bar baz bar foo foo zblah zblah zblah baz toto bar";
        int size = 10;
        List<Map.Entry<String, Integer>> res = MainClass.getSortedFrequencyList(sentence, size);
        System.out.println(res);
        assertEquals(res.size(), 10);

    }

}
