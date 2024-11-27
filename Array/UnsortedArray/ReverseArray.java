import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        reverseArray(arr, 0, arr.length - 1);
        printArray(arr);
    }

    static void reverseArray(int arr[], int start, int end) {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start + 1, end - 1);
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
