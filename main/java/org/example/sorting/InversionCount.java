package org.example.sorting;

public class InversionCount {

    public static long inversionCount()
    {
        long[] arr = {2,4,1,3,5};
        long N = 5;

        // Your Code Here
        int invCount = 0;
        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
                if(arr[i]>arr[j]) {
                    long temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    invCount++;
                }
            }
        }
        return invCount;
    }

}
