package bubblesort;

import java.util.Scanner;

public class Sorting {
    private Scanner input = new Scanner(System.in);

    public int[] getArray() {
        int[] array1 = new int[5];
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            array1[i] = input.nextInt();
        }
        return array1;
    }

    public int[] sortArray(int[] array1) {
        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = 0; j < array1.length - i - 1; j++) {
                if (array1[j] > array1[j + 1]) {
                    int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }
        return array1;
    }
}
