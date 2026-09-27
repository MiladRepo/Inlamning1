import java.io.Console;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        var text = "";

        var scanner = new Scanner(System.in);
        do
        {
            System.out.print("Säg nåt: ");
            text = scanner.nextLine();

            CountWord.addWord(text);

        } while (!text.toLowerCase().contains("stop"));

        System.out.println("Antal rader: " + CountWord.getRowCount());

        System.out.println("Antal ord: " + CountWord.getList().size());

        System.out.println("Antal bokstäver: " + CountWord.getLetterCount());

        System.out.println("Längsta ordet: " + CountWord.getLongestWord());

        scanner.close();
    }
}
