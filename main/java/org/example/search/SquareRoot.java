package org.example.search;

public class SquareRoot {

    public static long floorSqrt()
    {
        long x = 64;
        // Your code here

        if (x==1) {
            return 1;
        }

        long low = 1 ;
        long high = x/2;

        long result = 0;
        while(low<=high) {
            long mid  = (high+low)/2;
            if(mid*mid > x) {
                high = mid-1;
            } else if(mid*mid < x){
                low = mid+1;
            } else {
                return mid;
            }
        }

        if(low<high)
            result = low;
        else
            result = high;

        return result;
    }


}
