package TheFirstApp;

public class TheSixthTask {
    public static void main(String[] args) {
        String sentence = "I have two dogs. The dogs are in white and black color. I love my dogs.";
        String string_space = " ";
        String string_empty = "";
        String newString = "";
        char char_space = ' ';
        char char_empty = 0;

        System.out.println("Original String is: \"" + sentence + "\"");
        System.out.println("String after replacing is: \"" + sentence.replace(string_space, string_empty) + "\"");

        for (int i = 0, n = sentence.length(); i < n; i++) {
            char c = sentence.charAt(i);

            if (c == char_space) {
                c = char_empty;
            }

            String character = Character.toString(c);
            newString += character;
        }

        System.out.println("String after replacing is: \"" + newString + "\"");
    }
}
