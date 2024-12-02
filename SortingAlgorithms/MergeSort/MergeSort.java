package SortingAlgorithms.MergeSort;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 9, 7, 10, 5, 4, 3, 2, 1 };
        int n = arr.length;
        divide1(arr, 0, n - 1);
        System.err.println();
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
            if (arr[id1] < arr[id2]) {
                merge_arr[x] = arr[id1];
                x++;
                id1++;
            } else {
                merge_arr[x] = arr[id2];
                x++;
                id2++;
            }
        }
        while (id1 <= mid_idx) {
            merge_arr[x] = arr[id1];
            x++;
            id1++;
        }
        while (id2 <= ei) {
            merge_arr[x] = arr[id2];
            x++;
            id2++;
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

    public static void divide1(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid_idx = si + (ei - si) / 2;
        divide1(arr, si, mid_idx);
        divide1(arr, mid_idx + 1, ei);
        conquer(arr, si, mid_idx, ei);

    }

    public static void conquer1(int arr[], int si, int mid, int ei) {
        int merge[] = new int[ei - si + 1];

        int id1 = si;
        int id2 = mid + 1;
        int x = 0;

        while (id1 <= mid && id2 <= ei) {
            if (arr[id1] <= arr[id2]) {
                merge[x] = arr[id1];
                x++;
                id1++;
            } else {
                merge[x] = arr[id2];
                x++;
                id2++;
            }
        }
        while (id1 <= mid) {
            merge[x] = arr[id1];
            x++;
            id1++;
        }
        while (id2 <= ei) {
            merge[x] = arr[id2];
            x++;
            id2++;
        }

        for (int i = 0, j = si; i < arr.length; i++, j++) {
            arr[j] = merge[i];
        }
    }

}
