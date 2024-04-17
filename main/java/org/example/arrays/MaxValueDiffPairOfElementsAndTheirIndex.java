package org.example.arrays;

public class MaxValueDiffPairOfElementsAndTheirIndex {

    public  static int maxValue() {
        // code here

        //int arr[] = {1,0,1};
        //int N = 3;

        int N = 4;
        int array[] = {1,2,3,1};


        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++)
        {

            // Updating max and min variables
            // as described in algorithm.
            max1 = Math.max(max1, array[i] + i);
            min1 = Math.min(min1, array[i] + i);
            max2 = Math.max(max2, array[i] - i);
            min2 = Math.min(min2, array[i] - i);
        }

        // Calculating maximum absolute difference.
        return Math.max(max1 - min1, max2 - min2);
    }
}
