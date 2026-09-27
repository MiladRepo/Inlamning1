import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class CountWord {

    private static int _counter = 0;
    private static List<String> _listOfWords = new ArrayList<String>();

    public static void addWord(String text)
    {
        var splittedList  = Arrays.asList(text.split(" "));

        _listOfWords.addAll(_listOfWords.size(), splittedList);

        _listOfWords.removeIf(Predicate.isEqual("stop"));
        _listOfWords.removeIf(Predicate.isEqual("Stop"));

        _counter++;
    }

    public static List<String> getList(){
        return _listOfWords;
    }

    public static int getRowCount(){
        return _counter;
    }

    public static int getLetterCount(){
        return _listOfWords.stream().mapToInt(String::length).sum();
    }

    public static String getLongestWord(){
        return _listOfWords.stream().max(Comparator.comparing(String::length)).get();
    }

    public static void reset(){
        _counter = 0;
        _listOfWords.clear();
    }
}
