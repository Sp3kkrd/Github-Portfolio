package selectionsort;

import bubblesort.Sorting;

public class Main {
    public static void main(String[] args) {
        bubblesort.Sorting sorter = new Sorting();

        int[] unsortedArray = sorter.getArray();

        System.out.println("Unsorted:");
        for (int num : unsortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] sortedArray = sorter.sortArray(unsortedArray);

        System.out.println("Sorted:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
