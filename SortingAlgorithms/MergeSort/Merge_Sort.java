package SortingAlgorithms.MergeSort;

public class Merge_Sort {
    static int a[] = { 10, 14, 19, 26, 27, 31, 33, 35, 42, 44, 0 };
    static int b[] = new int[a.length];

    static void merging(int low, int mid, int high) {
        int l1, l2, i;
        for (l1 = low, l2 = mid + 1, i = low; l1 <= mid && l2 <= high; i++) {
            if (a[l1] <= a[l2])
                b[i] = a[l1++];
            else
                b[i] = a[l2++];
        }
        while (l1 <= mid)
            b[i++] = a[l1++];
        while (l2 <= high)
            b[i++] = a[l2++];
        for (i = low; i <= high; i++)
            a[i] = b[i];
    }

    static void sort(int low, int high) {
        int mid;
        if (low < high) {
            mid = (low + high) / 2;
            sort(low, mid);
            sort(mid + 1, high);
            merging(low, mid, high);
        } else {
            return;
        }
    }

    public static void main(String args[]) {
        int i;
        int n = a.length;
        System.out.println("Array before sorting");
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        sort(0, n - 1);
        System.out.println("\nArray after sorting");
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}

// package SortingAlgorithms.QuickSort;

// public class QuickSort {
// public static void main(String[] args) {
// int arr[] = { 9, 7, 6, 5, 4, 3, 2, 1 };
// int n = arr.length;

// divide(arr, 0, n - 1);
// printArray(arr);
// }

// public static void divide(int arr[], int si, int ei) {
// if (si >= ei) {
// return;
// }

// int mid_idx = si + (ei - si) / 2;
// divide(arr, si, mid_idx);
// divide(arr, mid_idx + 1, ei);
// conquer(arr, si, mid_idx, ei);
// }

// public static void conquer(int arr[], int si, int mid_idx, int ei) {
// int merge_arr[] = new int[ei - si + 1];

// int id1 = si;
// int id2 = mid_idx + 1;
// int x = 0;

// while (id1 <= mid_idx && id2 <= ei) {
// if (arr[id1] <= arr[id2]) {
// merge_arr[x++] = arr[id1++];
// } else {
// merge_arr[x++] = arr[id2++];
// }
// }
// while (id1 <= mid_idx) {
// merge_arr[x++] = arr[id1++];
// }

// while (id2 <= ei) {
// merge_arr[x++] = arr[id2++];
// }

// for (int i = 0, j = si; i < merge_arr.length; i++, j++) {
// arr[j] = merge_arr[i];
// }
// }

// public static void printArray(int arr[]) {
// System.out.println("Sorted Array:");
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }
// }
