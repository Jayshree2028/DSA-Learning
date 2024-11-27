package Array.RotateAraay;

import java.util.Scanner;

public class RightRotate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rotation : ");
        int r = sc.nextInt();
        rotateArray(arr, r);
        printArray(arr);
    }

    static void rotateArray(int arr[], int r) {
        int p = 1;
        while (p <= r) {
            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];

            }
            arr[arr.length - 1] = temp;
            p++;
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}