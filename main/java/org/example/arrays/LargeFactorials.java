package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class LargeFactorials {

    public void run() {
        int n = 21;
        long[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(factorial(A, n));
    }

    Map<Long, Long> map = new HashMap<>();

    public long[] factorial(long a[], int n) {
        // code here
        //System.out.println("starting time: "+System.currentTimeMillis());

        map.put(0L, 1L);
        map.put(1L, 1L);
        map.put(2L, 2L);
        int i=0;
        while(i<n){
            Long key = a[i];
            a[i] = getFactorial(a[i]);
            map.put(key, a[i]);
            i++;
        }
        //System.out.println("ending time: "+System.currentTimeMillis());
        return a;
    }

    public Long getFactorial(long i) {

        if(map.get(i)!=null) {
            return map.get(i);
        }

        return i*getFactorial(i-1);
    }

}
