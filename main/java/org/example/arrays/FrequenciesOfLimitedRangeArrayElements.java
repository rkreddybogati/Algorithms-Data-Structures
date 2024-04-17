package org.example.arrays;

import java.util.*;

public class FrequenciesOfLimitedRangeArrayElements {

    public static void frequencyCount() {

        int[] arr = {8,9};
        int N = 2;
        int P = 9;

        // code here
        Map<Integer, Integer> countMap = new HashMap<>(P);
        int i = 1;
        while(i<=P) {
            countMap.put(i,0);
            i++;
        }

        i=0;
        while(i<N) {
            if(arr[i] <= P) {
                int elementCount = countMap.get(arr[i]);
                countMap.put(arr[i], elementCount+1);
            }
            i++;
        }

        for (int j=0; j<N; j++){
            if (Objects.nonNull(countMap.get(j+1)))
                arr[j] = countMap.get(j+1) ;
        }

    }

}
