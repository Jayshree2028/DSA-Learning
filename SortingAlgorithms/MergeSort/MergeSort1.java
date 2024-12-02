package SortingAlgorithms.MergeSort;

public class MergeSort1 {
    public static void main(String[] args) {
        int arr[] = { 9, 7, 6, 5, 4, 3, 2, 1 };
        int n = arr.length;

        divide(arr, 0, n - 1);
        printArray(arr);
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid_idx = si + (ei - si) / 2;
        divide(arr, si, mid_idx);
        divide(arr, mid_idx + 1, ei);
        conquer(arr, si, mid_idx, ei);
    }

    public static void conquer(int arr[], int si, int mid_idx, int ei) {
        int merge_arr[] = new int[ei - si + 1];

        int id1 = si;
        int id2 = mid_idx + 1;
        int x = 0;

        while (id1 <= mid_idx && id2 <= ei) {
            if (arr[id1] <= arr[id2]) {
                merge_arr[x++] = arr[id1++];
            } else {
                merge_arr[x++] = arr[id2++];
            }
        }
        while (id1 <= mid_idx) {
            merge_arr[x++] = arr[id1++];
        }

        while (id2 <= ei) {
            merge_arr[x++] = arr[id2++];
        }

        for (int i = 0, j = si; i < merge_arr.length; i++, j++) {
            arr[j] = merge_arr[i];
        }
    }

    public static void printArray(int arr[]) {
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
