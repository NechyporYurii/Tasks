package TheFirstApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheFourthTask {
    public static void main(String[] args) {
        int[] array1 = new int [] {6, 2, 4, 17, 5, 15, 7, 8, 9, 20};
        int[] array2 = new int [] {20, 3, 2, 4, 15, 8, 11, 1, 10, 9};
        List<Integer> commonElements = new ArrayList<Integer>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    commonElements.add(array1[i]);
                }
            }
        }

        System.out.println("Спільні елементи = " + commonElements);

        List<Integer> listOfArray1 = Arrays.stream(array1).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        List<Integer> listOfArray2 = Arrays.stream(array2).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        listOfArray1.retainAll(listOfArray2);

        System.out.println("Спільні елементи = " + listOfArray1);
    }
}
