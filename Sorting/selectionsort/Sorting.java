package selectionsort;

import java.util.Scanner;

public class Sorting {

    public int[] getArray() {
        int[] array1 = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            array1[i] = scanner.nextInt();
        }
        return array1;
    }

    public int[] sortArray(int[] array1) {
        int n = array1.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array1[j] < array1[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array1[minIndex];
            array1[minIndex] = array1[i];
            array1[i] = temp;
        }
        return array1;
    }
}