package org.example.search;

// 2D array contains k+1 rows and n+1 columns, rows and columns starts from zero
        /*
        Eg:
        arr = {5, 10, 30, 20, 15};
        n = 5;
        k = 3;

            --------> wood logs
            0  1  2  3  4  5
        0   0  0  0  0  0  0
        1   0  5 15 45 65 80
        2   0  5 10 30 45 45
        3   0  5 10 30 30 35

        vertical no of workers.
        1. if workers are zero the time taken is zero dp[0][i]
        2. if no wood logs then time taken is zero dp[i][0]
        3. if only one wood log and more then one worer then the tame taken is length of wood log
        4. if only one worker then the time taken would be sum of all that partition

        Ans = dp[k+1][n+1];

        */
public class ThePaintersPartitionProblem2 {

    public static long minTime(){

        int[] arr = {5, 10, 30, 20, 15};
        int n = 5;
        int k = 3;

        //code here
        // if logs are only one the time take is the length of the single log
        if(n==1) {
            return arr[0];
        }

        // if only one worker available, time taken = sum of all the logs length
        if(k==1) {
            return getSum(arr, 0, n-1);
        }

        int[][] dp = new int[k+1][n+1];
        for(int i=1; i<=n; i++) {
            dp[1][i] = getSum(arr, 0, i-1);
        }
        for(int i=1; i<k; i++) {
            dp[i][1] = arr[0];
        }

        for(int i=2; i<=k; i++) {

            for(int j=2; j<=n; j++) {

                int min = Integer.MAX_VALUE;
                for(int p=1; p<=j; p++) {
                    min = Math.min(Math.max( dp[i-1][p], getSum(arr, p, j-1) ), min);
                }

                dp[i][j] = min;
            }

        }
        //return dp[0].length;
        return dp[k][n];
    }

    private static int getSum(int[] arr, int start, int end) {
        int sum =0;
        for(int i=start; i<=end; i++) {
            sum = sum+arr[i];
        }
        return sum;
    }
}

