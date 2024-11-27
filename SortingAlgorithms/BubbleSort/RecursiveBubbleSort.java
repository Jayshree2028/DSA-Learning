package SortingAlgorithms.BubbleSort;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 1, 3 };
        int n = arr.length;
        recursiveBubbleSort(arr, n);

        System.out.println("Sorted array : ");
        System.out.println(Arrays.toString(arr));

    }

    public static void recursiveBubbleSort(int arr[], int n) {
        if (n == 1) {
            return;
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count = count + 1;
            }
            recursiveBubbleSort(arr, n - 1);

        }
        if (count == 0) {
            return;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}
