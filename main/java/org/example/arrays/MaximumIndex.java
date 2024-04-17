package org.example.arrays;

public class MaximumIndex {

    public static int maxIndexDiff() {

        //int A[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        //int N = 9;

        int A[] = {82, 63, 44, 74, 82, 99, 82};
        int N = 7;

        // Your code here
        /*int max = 0;
        for(int i=N-1; i>0; i--){

            for(int j=0; j<N-1; j++){

                if(A[i]>=A[j]) {
                    max = Math.max(max, i-j);
                    break;
                }

            }
        }
        return max;*/

        // prefix (left to right - minimum) & suffix (right to left - max)
        int[] prefix = new int[A.length];
        int[] suffix = new int[A.length];
        prefix[0] = A[0];
        suffix[N-1] = A[N-1];
        for (int i=1; i<A.length; i++) {
            prefix[i] = Math.min(prefix[i-1], A[i]);
            suffix[N-i-1] = Math.max(suffix[N-i], A[N-i-1]);
        }

        int j,k,ans;
        j=k=ans=0;
        while (j<N){
            if (prefix[j]<=suffix[k]) {
                ans = Math.max(ans, k-j);
                k++;
            } else {
                j++;
            }
            if (k==N || j==N){
                break;
            }
        }

        return ans;

    }

}
