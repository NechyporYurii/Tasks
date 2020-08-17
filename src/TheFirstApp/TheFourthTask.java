package TheFirstApp;

import java.util.ArrayList;
import java.util.List;

public class TheFourthTask {
    public static void main(String[] args) {
        int[] array1 = new int [] {6, 2, 4, 17, 5, 15, 7, 8, 9};
        int[] array2 = new int [] {3, 2, 4, 15, 8, 11, 1, 10, 9};
        List<Integer> commonElements = new ArrayList<Integer>();

        for (int i = 0; i < array1.length; i++)
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == array2[j])
                    commonElements.add(array1[i]);
            }
        System.out.println("Спільні елементи = " + commonElements);
    }
}
