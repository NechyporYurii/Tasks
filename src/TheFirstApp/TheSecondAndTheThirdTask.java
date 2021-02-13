package TheFirstApp;

import java.util.Arrays;

public class TheSecondAndTheThirdTask {
    public static void main(String[] args) {
        int[] array = {6, 2, 4, 17, 5, 15, 7, 8, 9};
        int sum = 0, min = array[0], max  = array[0];

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            if (min > array[i]) {
                min = array[i];
            }

            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.println("Сума елементів масива = " + sum);
        System.out.println("Мінімальний елемент = " + min);
        System.out.println("Максимальний елемент = " + max);
        System.out.println("Мінімальний елемент = " + Arrays.stream(array).min().getAsInt());
        System.out.println("Максимальний елемент = " + Arrays.stream(array).max().getAsInt());
    }
}
