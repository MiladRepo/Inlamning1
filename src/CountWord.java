import java.util.ArrayList;
import java.util.Arrays;
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
}
