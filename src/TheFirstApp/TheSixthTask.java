package TheFirstApp;

public class TheSixthTask {
    public static void main(String[] args) {
        String sentence = "I have two dogs. The dogs are in white and black color. I love my dogs.";
        String space = " ";
        String empty = "";

        System.out.println("Original String is: \"" + sentence + "\"");
        System.out.println("String after replacing is: \"" + sentence.replace(space, empty) + "\"");
    }
}
