import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Comparator;


public class UnitTests {
    @Test
    public void testAddWordCount(){

        CountWord.addWord("Hej");

        CountWord.addWord("Hej1");

        var count = CountWord.getList().size();

        assertEquals(2, count);
    }

    @Test 
    public void testAddWordWithStop(){

        CountWord.addWord("stop");
        
        assertEquals(0, CountWord.getList().size());
    }

    @Test
    public void testLongestWord(){
        CountWord.addWord("hejhej");
        CountWord.addWord("hejhejhejhejhej");
        CountWord.addWord("hejhejh");

        var longestWord = CountWord.getList().stream().max(Comparator.comparing(String::length)).get();

        assertEquals("hejhejhejhejhej", longestWord);
    }
}
