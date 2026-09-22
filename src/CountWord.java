import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CountWord {

    private static List<String> _listOfWords = new ArrayList<>();

    public CountWord() {
        
    }

    public static void addWord(String text)
    {
        if (!text.equalsIgnoreCase("stop"))
        {
            _listOfWords.add(text);
        }
    }

    public static List<String> getList(){
        return _listOfWords;
    }

    public static int getListCount(){
        return _listOfWords.size();
    }

    public static int[] getWordLengthInList(){
        return _listOfWords.stream().mapToInt(String::length).toArray();
    }

    public static String getLongestWord(){
        return _listOfWords.stream().max(Comparator.comparing(String::length)).get();
    }
}
