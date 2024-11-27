
// package Array.RotateAraay;

// import java.util.Scanner;

// public class RotateArray {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Rotation : ");
//         int r = sc.nextInt();
//         reverseArray(arr, 0, arr.length - 1);
//         reverseArray(arr, 0, r - 1);
//         reverseArray(arr, r, arr.length - 1);
//         printArray(arr);
//     }

//     static void reverseArray(int arr[], int start, int end) {
//         int temp;
//         if (start >= end)
//             return;
//         temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] = temp;

//         reverseArray(arr, start + 1, end - 1);
//     }

//     static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

// }

package Array.RotateAraay;

import java.util.Scanner;

/**
 * RotateArray
 */
public class RotateArray {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 45, 66, 78, 90 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Array is : ");
        printArray(arr);
        System.out.println();
        System.out.print("Enter Number of Rotations : ");
        int r = sc.nextInt();
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, r - 1);
        reverseArray(arr, r, arr.length - 1);
        System.out.print("After Array Rotation  : ");
        printArray(arr);
    }

    static void reverseArray(int arr[], int start, int end) {
        int temp;
        while (start >= end) {
            return;
        }
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

// package Array.RotateAraay;

// import java.util.Scanner;

// /**
// * RotateArray
// */
// public class RotateArray {
// public static void main(String[] args) {
// int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
// Scanner sc = new Scanner(System.in);
// System.err.print("Array Is : ");
// printArray(arr);
// System.err.println();
// System.err.println("Enter No Of Rotation : ");
// int r = sc.nextInt();
// reverseArray(arr, 0, arr.length - 1);
// printArray(arr);
// reverseArray(arr, 0, r - 1);
// reverseArray(arr, r, arr.length - 1);

// System.err.println("After Rotation : ");
// printArray(arr);
// }

// static void printArray(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// static void reverseArray(int arr[], int start, int end) {
// int temp;
// if (start >= end)
// return;

// temp = arr[start];
// arr[start] = arr[end];
// arr[end] = temp;

// reverseArray(arr, start + 1, end - 1);

// }

// }