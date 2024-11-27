import java.util.Scanner;

public class InsertElementAtPositionToArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[20];
        arr[0]=1;
        arr[1]=5;
        arr[2]=4;
        arr[3]=43;
        arr[4]=12;
        arr[5]=51;
        arr[6]=54;
        arr[7]=43;
        int a= 8;
        System.out.print("Array is : ");
        for(int i=0; i<a;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter Element to Insert : ");
        int key = input.nextInt();
        System.out.print("Enter Position : ");
        int pos = input.nextInt();
        InsertElementAtPosition(arr,pos,a,key);
        a += 1;
        System.out.print("After Inserting Element Array is : ");
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+ "  ");
        }
    }
  
    static void InsertElementAtPosition(int arr[],int pos,int n, int key){
        for(int i = n-1; i>=pos; i--){
            arr[i+1]= arr[i];
          
        }
        arr[pos] = key;
    }
    
    
}
