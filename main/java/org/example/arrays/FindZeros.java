package org.example.arrays;


public class FindZeros {

    public static void run() {
        int n = 11;
        int m = 2;
        int[] A = {1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1};
        System.out.println(findZeroes(A, n, m));
    }

    static int findZeroes(int arr[], int n, int m) {
        // code here

        int i = 0;
        int start = 0;
        int end = 0;
        int zeroCount = 0;
        int cosecutiveOnes = 0;
        while(i<n) {

            if(arr[start]==0 && zeroCount==2) {
                if (end-start > cosecutiveOnes){
                    cosecutiveOnes = end-start;
                }
                start++;
                zeroCount++;
                continue;
            }

            if(arr[end]==0 && zeroCount==2) {
                if (end-start > cosecutiveOnes){
                    cosecutiveOnes = end-start;
                }
                end++;
                zeroCount++;
                continue;
            }


            if(zeroCount>=m+1) {
                if (arr[start]==0)
                    zeroCount--;
                if (arr[end]==0)
                    zeroCount--;
                start = start+1;
            }

            if(((end-start+1) > cosecutiveOnes) && zeroCount >= m) {
                cosecutiveOnes = (end-start)+1;
            }

            i++;
        }

        return cosecutiveOnes;
    }

}
