package SortingAlgorithms.InsertionSort;

public class InsersionSort {

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 2, 1, 6 };
        insertionSort(arr);
        System.out.println();
        printArray(arr);

    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int current = arr[i];
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
