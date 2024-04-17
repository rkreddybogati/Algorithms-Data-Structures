package org.example.arrays;

public class TrappingRainWater {

    public static long trappingWater() {

        int n = 4;
        int[] arr = {7, 4, 0, 9};
        // Your code here

        int i=1;
        int[] l = new int[arr.length];
        l[0]=arr[0];
        while(i<n){
            l[i] = Math.max(l[i-1], arr[i]);
            i++;
        }

        i=n-2;
        int[] r = new int[arr.length];
        r[n-1]=arr[n-1];
        while(i>=0){
            r[i] = Math.max(r[i+1], arr[i]);
            i--;
        }

        i = 0;
        int ans = 0;
        while(i<n){
            ans+= Math.max(0, Math.min(l[i], r[i])-arr[i]);
            i++;
        }

        return ans;
    }

}
