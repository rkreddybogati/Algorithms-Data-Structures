package org.example.math;

public class SmallestPositiveInteger {


    public static void run() {
        int N = 6;
        long[] array = {1, 10, 3, 11, 6, 15};
        System.out.println(smallestpositive(array, N));
    }

    static long smallestpositive(long[] array, int n){

        long smallestpositive = 1;
        for(int i=0; i<n&&array[i]<=smallestpositive; i++){
            smallestpositive = smallestpositive+array[i];
        }
        return smallestpositive;
    }


}
