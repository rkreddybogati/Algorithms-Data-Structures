package org.example.arrays;

public class AlternatePositiveNegativeNumbers {

    public static void rearrange() {

        int n = 10;
        int[] arr = {93, 85, -59, 45, -89, -41, -4, -98, 79, -12};

        int l =0;
        int negativeCount = 0;
        int positiveCount = 0;
        while(l<n){
            if(arr[l]<0){
                negativeCount++;
            } else {
                positiveCount++;
            }
            l++;
        }


        // code here
        int i=0;
        int positiveIndex=0;
        int negativeIndex=0;
        int[] positiveArr = new int[positiveCount];
        int[] negativeArr = new int[negativeCount];

        while(i<n){
            if (arr[i]>=0){
                positiveArr[positiveIndex] = arr[i];
                positiveIndex++;
            }
            if (arr[i]<0){
                negativeArr[negativeIndex] = arr[i];
                negativeIndex++;
            }
            i++;
        }

        int leastCount = 0;
        if (positiveCount<negativeCount) {
            leastCount = positiveCount;
        } else {
            leastCount = negativeCount;
        }

        int x = 0;
        positiveIndex = 0;
        negativeIndex = 1;
        while (x < leastCount) {
            arr[positiveIndex] = positiveArr[x];
            arr[negativeIndex] = negativeArr[x];
            positiveIndex=positiveIndex+2;
            negativeIndex=negativeIndex+2;
            x++;
        }

        int k = leastCount;
        if (positiveCount<negativeCount) {
            while (k<negativeCount) {
                arr[k+leastCount] = negativeArr[k];
                k++;
            }
        } else {
            while (k<positiveCount) {
                arr[k+leastCount] = positiveArr[k];
                k++;
            }
        }

    }

}
