package org.example.search;

public class MedianOfTwoSortedArraysOfDifferentSizes {


    public static double medianOfArrays()
    {
        int m = 3;
        int n = 4;
        int a[] = {1,5,9};
        int b[] = {2,3,6,7};
        // Your Code Here
        int i=0;
        int j=0;
        int k=0;
        int[] newArr = new int[n+m];
        while(i<m && j<n){
            if(a[i]<=b[j]){
                newArr[k] = a[i];
                i++;
            } else {
                newArr[k] = b[j];
                j++;
            }
            k++;
        }

        while (i<m){
            newArr[k] = a[i];
            i++;
            k++;
        }

        while (j<n){
            newArr[k] = a[j];
            j++;
            k++;
        }

        double median = 0;
        if( (1+n+m)%2==0 ){
            median = newArr[(n+m)/2];
        } else {
            median = (double) (newArr[(n + m - 1) / 2] + newArr[(n + m) / 2]) / 2;
        }
        return median;
    }
}
