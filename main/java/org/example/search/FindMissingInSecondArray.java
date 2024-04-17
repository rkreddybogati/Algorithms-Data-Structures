package org.example.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindMissingInSecondArray {

    public static ArrayList<Long> findMissing()
    {

        int N = 24;
        int M = 6;
        long[] A = {227, 2, 17, 15, 17, 21, 26, 30, 16, 12, 19, 22, 18, 8, 24, 10, 17, 28, 14, 7, 4, 21, 3, 4};
        long[] B = {25, 12, 30, 24, 14, 34};

        HashSet<Long> set = new HashSet<>();
        for(int j=0; j<M; j++){
            set.add((Long)B[j]);
        }

        ArrayList<Long> list = new ArrayList<>();
        int i=0;
        while(i<N){
            if(!set.contains(A[i])) {
                list.add(A[i]);
            }
            i++;
        }

        return list;
    }

}
