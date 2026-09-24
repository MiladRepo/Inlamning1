import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Comparator;


public class UnitTests {
    @Test
    public void testAddWordCount(){

        CountWord.addWord("Hej");

        CountWord.addWord("Hej1");

        var count = CountWord.getListCount();

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

        var longestWord = CountWord.getLongestWord();

        assertEquals("hejhejhejhejhej", longestWord);
        
    }
    @Test 
    public void testWordLength(){
        CountWord.addWord("hejhej");

        var wordLength = CountWord.getWordLengthInList();

        var arr = new int[]{6};

        assertArrayEquals(arr, wordLength);
    }
}
