package org.example.arrays;

public class EquilibriumPoint {


    public static void run() {
        int n = 5;
        long[] A = {1,3,5,2,2};
        System.out.println(equilibriumPoint(A, n));
    }


    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        int left = 0, pivot = 0, right = 0;
        for (int i = 1; i < n; i++) {
            right += arr[i];
        }
        while (pivot < n - 1 && right != left) {
            pivot++;
            right -= arr[pivot];
            left += arr[pivot - 1];
        }
        return (left == right) ? (pivot+1) : -1;
    }

}
