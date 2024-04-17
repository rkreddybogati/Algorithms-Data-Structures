package org.example.math;

public class MissingNumberInArray {

    public static void run() {
        int N = 10;
        long[] array = {6,1,2,8,3,4,7,10,5};
        System.out.println(missingNumberInArray(array, N));
    }

    static long missingNumberInArray(long[] array, int n){

        long actualSum = 0;
        int i = n-1;
        while (i>0) {
            actualSum = actualSum+array[i-1];
            i--;
        }

        long expectedSum = 0;
        while (n>0) {
            expectedSum = expectedSum+n;
            n--;
        }
        return expectedSum-actualSum;
    }


}
