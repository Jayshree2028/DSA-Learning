package SortingAlgorithms.InsertionSort;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 6, 7, 1, 9 };
        recursiveInsertionSort(arr, arr.length);
        printArray(arr);

    }

    public static void recursiveInsertionSort(int arr[], int n) {
        if (n <= 1)
            return;
        recursiveInsertionSort(arr, n - 1);
        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;

        }
        arr[j + 1] = last;
        recursiveInsertionSort(arr, n - 1);

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
