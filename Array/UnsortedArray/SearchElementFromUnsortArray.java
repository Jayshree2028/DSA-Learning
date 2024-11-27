import java.util.Scanner;

public class SearchElementFromUnsortArray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 74, 65, 1, 8, 9, 35, 14, 11, 7, 72, 27, 52 };
       
        System.out.println("Array is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Element To Search in Array : ");
        int element = input.nextInt();
        int position = findElement(arr, element);
        if (position == -1) {
            System.out.println("Element is not found in given array.");
        } else {
            System.out.println("Element is present at position is " + (position + 1));
        }      

    }

    public static int findElement(int arr[], int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element)
                return i;
        }
        return -1;
    }
   
}
