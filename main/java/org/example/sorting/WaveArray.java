package org.example.sorting;

public class WaveArray {

    public static void convertToWave() {
        int n = 6;
        int a[] = {2,4,7,8,9,10};
        // code here
        int i=0;
        int j=1;
        int temp = 0;
        while(i<n && j<n ) {
            temp = a[j];
            a[j] = a[i];
            a[i] = temp;
            i+=2;
            j+=2;
        }

    }

}
