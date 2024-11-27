import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 41, 56, 85, 74, 69, 84 };
        Scanner input = new Scanner(System.in);

        System.out.print("Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter Elemet To delete : ");
        int key = input.nextInt();

        int n = deleteArrayElement(arr, key);
        System.out.println("After Deleting element Array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    static int findElement(int arr[], int key) {
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    static int deleteArrayElement(int arr[], int key) {
        int pos = findElement(arr, key);
        int n = arr.length;
        if (pos == -1) {
            System.out.println("Element is not found for delete");
            return n;
        }

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return n - 1;

    }

}
