package org.example.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class LongestSusequentNumbers {

    public static void run() {
        int n = 7;
        int[] A = {2,6,1,9,4,5,3};
        System.out.println(findLongestConseqSubseq(A, n));
    }

    static int findLongestConseqSubseq(int arr[], int N)
    {

        Set<Integer> treeSet = new TreeSet<Integer>();
        int i=0;
        while(i<N){
            treeSet.add(arr[i]);
            i++;
        }

        Integer[] sortedArr = treeSet.stream().toArray(Integer[] :: new);

        int maxLongest = 1;
        int longest = 1;
        int left = 0;
        int right = 1;
        while (right<sortedArr.length) {
            if(sortedArr[left] + 1 == sortedArr[right]) {
                longest++;
            } else {
                longest = 1;
            }

            if (maxLongest < longest) {
                maxLongest = longest;
            }
            left++;
            right++;
        }
        return maxLongest;
    }

}
