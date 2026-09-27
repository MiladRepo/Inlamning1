import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Comparator;


public class UnitTests {

    public UnitTests() {
        CountWord.reset();
    }

    @Test
    public void testRowCount(){

        CountWord.addWord("Hej Hej");

        CountWord.addWord("Hej1");

        var count = CountWord.getRowCount();

        assertEquals(2, count);
    }

    @Test 
    public void testWordWithStop(){

        CountWord.addWord("Hej stop");
        
        assertEquals(0, CountWord.getList().size());
    }

    @Test 
    public void testWordWithCapitalStop(){

        CountWord.addWord("Hej Stop");
        
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
    public void testLetterCount(){

        CountWord.addWord("hejhej hej");
        CountWord.addWord("hej2");

        var letterCount = CountWord.getLetterCount();

        assertEquals(13, letterCount);
    }

    @Test 
    public void testWordCount(){

        CountWord.addWord("hejhej hej");
        CountWord.addWord("hej");

        var wordCount = CountWord.getList().size();

        assertEquals(3, wordCount);
    }
    
}
