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
            text = scanner.next();

            CountWord.addWord(text);

        } while (!text.equalsIgnoreCase("stop"));

        System.out.println("Antal ord: " + CountWord.getList().size());

        for (String item : CountWord.getList()) {
            System.out.print(item.length() + " ");
        }

        System.out.println("Längsta ordet: " + CountWord.getList().stream().max(Comparator.comparing(String::length)).get());

        scanner.close();
    }
}
