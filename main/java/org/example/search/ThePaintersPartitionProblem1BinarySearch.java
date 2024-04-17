package org.example.search;

public class ThePaintersPartitionProblem1BinarySearch {

    public static long minTime(){

        int[] arr = {5, 10, 15, 20, 30};
        int n = 5;
        int k = 3;

        int low = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            low = Math.max(arr[i], low);
        }

        int high = 0;
        for(int i=0; i<n; i++){
            high+=arr[i];
        }

        while(low<high) {
            int mid = low+((high-low)/2);
            int noOfWorkers = getNoOfWorkers(arr, n, mid);
            if(noOfWorkers<=k) {
                high = mid;
            } else {
                low = mid+1;
            }
        }

        return low;
    }
    private static int getNoOfWorkers(int[] arr, int n, int highest) {
        int total = 0;
        int noOfWorkers = 0;
        for(int i=0; i<n; i++) {
            total+=arr[i];

            if(total>highest) {
                total = arr[i];
                noOfWorkers++;
            }
        }
        return noOfWorkers;
    }
}

