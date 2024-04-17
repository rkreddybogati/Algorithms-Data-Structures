package org.example.sorting;

import java.util.Arrays;

public class CountPairs {

    // Function to returns count of pairs (x, y) such that
    // x belongs to X[], y belongs to Y[] and x^y > y^x
    public static long countPairs()
    {
        int X[] = { 2, 1, 6 };
        int Y[] = { 1, 5 };

        // To store counts of 0, 1, 2, 3 and 4 in array Y
        int NoOfY[] = new int[5];
        for (int i = 0; i < Y.length; i++)
            if (Y[i] < 5)
                NoOfY[Y[i]]++;

        // Sort Y[] so that we can do binary search in it
        Arrays.sort(Y);

        long total_pairs = 0; // Initialize result

        // Take every element of X and count pairs with it
        for (int i = 0; i < X.length; i++)
            total_pairs += count(X[i], Y, Y.length, NoOfY);

        return total_pairs;
    }

    // Function to return count of pairs with x as one
    // element of the pair. It mainly looks for all values
    // in Y[] where x ^ Y[i] > Y[i] ^ x
    static int count(int x, int Y[], int n, int NoOfY[])
    {


        // If x is 0, then there cannot be any value in Y
        // such that x^Y[i] > Y[i]^x
        if (x == 0)
            return 0;

        // If x is 1, then the number of pairs is equal to
        // number of zeroes in Y[]
        if (x == 1)
            return NoOfY[0];

        // Find number of elements in Y[] with values
        // greater than x getting upperbound of x with
        // binary search
        int idx = Arrays.binarySearch(Y, x);
        int ans;
        if (idx < 0) {
            idx = Math.abs(idx + 1);
            ans = Y.length - idx;
        }
        else {
            while (idx < n && Y[idx] == x) {
                idx++;
            }
            ans = Y.length - idx;
        }

        // If we have reached here, then x must be greater
        // than 1, increase number of pairs for y=0 and y=1
        ans += (NoOfY[0] + NoOfY[1]);

        // Decrease number of pairs for x=2 and (y=4 or y=3)
        if (x == 2)
            ans -= (NoOfY[3] + NoOfY[4]);

        // Increase number of pairs for x=3 and y=2
        if (x == 3)
            ans += NoOfY[2];

        return ans;
    }



    /*public static void countPairs() {
        int[] X = { 2,3,4,5 };
        int[] Y = { 1,2,3};
        System.out.println(countPairs(X, Y));
    }

    // Function to count pairs where an element
    // from X is greater than an element from Y
    private static int countPairs(int[] X, int[] Y)
    {
        if (X.length == 0 || Y.length == 0) {
            return 0;
        }
        if (X.length == 1) {
            int count = 0;
            for (int y : Y) {
                if (y > X[0]) {
                    count++;
                }
            }
            return count;
        }
        if (Y.length == 1) {
            int count = 0;
            for (int x : X) {
                if (x < Y[0]) {
                    count++;
                }
            }
            return count;
        }
        int[] X_left = Arrays.copyOfRange(X, 0, X.length / 2);
        int[] X_right = Arrays.copyOfRange(X, X.length / 2, X.length);
        int[] Y_left = Arrays.copyOfRange(Y, 0, Y.length / 2);
        int[] Y_right = Arrays.copyOfRange(Y, Y.length / 2, Y.length);
        int count = 0;
        count += countPairs(X_left, Y_left);
        count += countPairs(X_left, Y_right);
        count += countPairs(X_right, Y_left);
        count += countPairs(X_right, Y_right);
        return count;
    }*/


}
