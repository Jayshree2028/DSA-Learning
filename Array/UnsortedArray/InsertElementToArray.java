import java.util.Scanner;

public class InsertElementToArray {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 3;
        arr[2] = 11;
        arr[3] = 13;
        arr[4] = 14;
        arr[5] = 30;
        arr[6] = 28;
        arr[7] = 33;
        int capacity = arr.length;

        int n = 8;
        Scanner input = new Scanner(System.in);
        System.out.print("Before inserting element in array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter Element Insert into Array : ");
        int key = input.nextInt();
       
        n = InsertElement(arr,key,capacity,n);
        System.out.println();
        System.out.print("After inserting Element in Array is  : ");
        for(int i =0; i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static int InsertElement(int arr[], int key, int capacity, int n) {
        // Cannot insert more elements if n
        // is already more than or equal to
        if(n>=capacity)
        return n;
        arr[n]= key;
      return n+1;
    }

}
