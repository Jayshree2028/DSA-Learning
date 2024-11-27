
package Array.RotateAraay;

import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) {
        int a[] = { 1, 1, 1, 2, 2, 3, 4, 5, 6 };
        int b[] = { 1, 1, 2, 2, 3, 4 };

        // Array to store counts of occurrences of elements from a in b
        int[] counts = new int[a.length];

        // Loop through elements in a
        for (int i = 0; i < a.length; i++) {
            // Initialize count for current element in a
            counts[i] = 0;

            // Loop through elements in b
            for (int j = 0; j < b.length; j++) {
                // Check if current element in a equals current element in b
                if (a[i] == b[j]) {
                    // Increment count if they are equal
                    counts[i]++;
                }
            }
        }

        // Print the occurrences of elements from a in b
        System.out.println("Occurrences of elements from a in b:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " : " + counts[i]);
        }
    }
}
