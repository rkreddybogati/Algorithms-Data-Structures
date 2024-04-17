package org.example.sorting;

public class NumberOfPairs {

    // x[], y[]: input array elements
    // M, N: size of arrays x[] and y[] respectively
    //Function to count number of pairs such that x^y is greater than y^x.
    public static long countPairs()
    {
        int x[] = {2,1,6};
        int y[] = {1,5};
        int M = 3;
        int N = 2;
        // your code here
        int count =0;
        for(int i=0; i<x.length; i++) {
            for(int j=0; j<y.length; j++) {
                if(Math.pow(x[i], y[j]) > Math.pow(y[j], x[i]) ) {
                    count++;
                }
            }
        }
        return count;
    }
}
