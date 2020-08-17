package TheFirstApp;

public class TheSeventhTask {
    public static void main(String[] args) {
        String word = "китнаморіромантик";
        char wordAsArray[] = word.toCharArray();
        char newWordAsArray[] = new char[wordAsArray.length];
        int j = 0;

        for (int i = wordAsArray.length - 1; i >= 0; i--) {
            newWordAsArray[j] = wordAsArray[i];
            j++;
        }
        String newWord = new String(newWordAsArray);

        if (word.equals(newWord))
        {
            System.out.println("Це слово є паліндромом");
        }
        else System.out.println("Це слово не є паліндромом");
    }
}
