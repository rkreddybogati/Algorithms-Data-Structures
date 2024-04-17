package org.example.search;

import java.util.Arrays;

public class BinarySearchInForest {

    public static int find_height()
    {
        //int[] tree = {81, 13, 36, 65, 38, 69};
        //int n=6; int k = 47;

        int[] tree = {2, 3, 5, 2, 4};
        int n=5; int k = 6;

        Arrays.sort(tree);

        if(n==1) {
            return tree[0]-k;
        }

        return findHeight(tree, n, k);
    }

    private static int findHeight(int[] arr, int n, int k) {

        int low = 0;
        int height = arr[arr.length-1];
        while(low <= height) {

            int middle = low + ((height-low)/2);

            int woodLogSum = getWoodLogSum(arr, middle, n);
            if(woodLogSum==k){
                return middle;
            }

            if(woodLogSum > k) {
                low = middle+1;
            } else {
                height = middle-1;
            }
        }

        return -1;
    }

    private static int getWoodLogSum(int[] arr, int middle, int end) {
        int sum = 0;
        for(int i=end-1; i>0; i--) {
            if((arr[i]-middle)<=0)
                break;
            sum = sum+(arr[i]-middle);
        }
        return sum;
    }


}
