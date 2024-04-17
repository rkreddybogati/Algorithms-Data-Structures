package org.example.arrays;

import java.util.ArrayList;

public class SubarrayWithGivenSum {

    public static ArrayList<Integer> subarraySum() {

        /*int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 10;
        int s = 15;*/
/*
        int[] arr = {1, 2, 3, 7, 5};
        int n = 5;
        int s = 12;*/

        /*int[] arr = {135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};
        int n = 42;
        int s = 468;*/

        int[] arr = {0};
        int n = 1;
        int s = 0;


        // Your code here
        ArrayList<Integer> list = new ArrayList();

        if(n==1 && s==arr[0]) {
            list.add(1);
            list.add(1);
        } else if(n==1 && s!=arr[0]){
            list.add(-1);
        } else {
            int i=0;
            int j=0;
            int sum = 0;
            while(j<=n) {

                if(sum==s){
                    break;
                }

                if(sum > s) {
                    sum = sum-arr[i];
                    i++;
                }

                if(sum < s) {
                    sum = sum+arr[j];
                    j++;
                }
            }
            list.add(i+1);
            list.add(j);
        }
        return list;
    }


}
