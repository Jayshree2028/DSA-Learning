package SortingAlgorithms.SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 7, 6, 5, 9, 10 };
        selectionSort(arr);
        System.out.println("Sorted Array is : ");
        printArray(arr);
        recursiveSelectionSort(arr, arr.length, 0);
        System.out.println();
        System.out.println("Sorted Array using recursive : ");
        printArray(arr);

    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }

    }

    public static void recursiveSelectionSort(int arr[], int n, int index) {
        if (index == n)
            return;

        int k = min_index(arr, index, index);
        if (k != index) {
            int temp = arr[k];
            arr[k] = arr[index];
            arr[k] = temp;
        }
        recursiveSelectionSort(arr, n, index + 1);

    }

    public static int min_index(int arr[], int i, int j) {
        if (i == j) {
            return i;
        }
        int k = min_index(arr, i + 1, j);
        return (arr[i] < arr[k]) ? i : k;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
