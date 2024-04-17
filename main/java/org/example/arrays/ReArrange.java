package org.example.arrays;

import java.util.Arrays;
import java.util.List;

public class ReArrange {

    public static void run() {
        int n = 10;
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearrange(arr, n);
    }

    static void rearrange(int arr[], int n) {

        // code here
        int[] resultArr = new int[n];

        int negativeCount=0;
        int i=0;
        while(i<n){
            if (arr[i]<0) {
                negativeCount++;
            }
        }

        if (negativeCount==n || negativeCount==0) {
            return;
        }

        i=0;
        int negative = 1;
        while(i<n){
            if(arr[i]<0){
                resultArr[negative] = arr[i];
                negative=negative+2;
            }
            i++;
        }
        negative = negative-2;

        i=0; // {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int positive = 0;
        while(i<n){
            if(arr[i]>=0 && i<negative){
                resultArr[positive] = arr[i];
                positive=positive+2;
                i++;
                continue;
            } else if(arr[i]>=0 ) {
                resultArr[positive] = arr[i];
                positive++;
            }
            i++;
        }

        i=0;
        while(i<n){
            arr[i]=resultArr[i];
            i++;
        }

    }
}
