package TheFirstApp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheFifthTask {
    public static void main(String[] args) {
        String text = "I have two dogs. The dogs are in white and black color. I love my dogs.";
        String word = "dogs";
        int count = 0;

        Pattern p = Pattern.compile(word);
        Matcher m = p.matcher( text );
        while (m.find()) {
            count++;
        }
        System.out.println("Кількість появ слова " + word + " в реченні \'" + text + "\' є " + count);
    }
}
