package SortingAlgorithms.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 1, 3 };
        int n = arr.length;
        bubbleSortArray(arr, n);
        System.out.println();
        printArray(arr);

    }

    static void bubbleSortArray(int arr[], int n) {
        int i, j;
        boolean swaped;
        for (i = 0; i < n - 1; i++) {
            swaped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaped = true;
                }
            }

            if (swaped == false) {
                break;
            }
        }

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}