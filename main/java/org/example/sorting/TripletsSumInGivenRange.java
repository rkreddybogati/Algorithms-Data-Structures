package org.example.sorting;

import java.util.Arrays;

public class TripletsSumInGivenRange {

    public static int countTriplets() {

        int N = 4;
        int[] Arr = {8 , 3, 5, 2};
        int L = 7;
        int R = 11;

        // code here
        Arrays.sort(Arr);
        return getCountForGivenRange(Arr, R) - getCountForGivenRange(Arr, L-1);
    }

    private static int getCountForGivenRange(int a[], int range) {
        int count = 0;
        for(int i=0; i<a.length; i++) {
            int j = i+1;
            int k = a.length-1;
            while(j<k ) {
                int sum = a[i]+a[j]+a[k];
                if(sum>range) {
                    k--;
                } else {
                    count=count+(k-j);
                    j++;
                }
            }
        }
        return count;
    }

}
