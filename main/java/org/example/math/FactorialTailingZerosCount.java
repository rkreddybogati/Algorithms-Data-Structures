package org.example.math;

public class FactorialTailingZerosCount {

    public static void run() {
        System.out.println(trailingZeroes(30));
    }

    public static int trailingZeroes(int n) {

        /*
        // 5 10 15 20 25   30 35 40 45  50  ---- 75 -- 100
        // 5 5  5  5   5*5  5  5  5  5  5*5      5*5    5*5

        25/5 = 5
        5/5 = 1
        1/5 = 0

        30/5 = 6
        6/5 = 1
        1/5 = 0

        50/5 = 10
        10/5 = 2
        2/5 = 0

        100/5 = 20
        20/5 = 4
        4/5 = 0
        */
        int tailingZeros = 0;
        while(n/5 != 0) {
            n = n/5;
            tailingZeros = tailingZeros + n;
        }

        return tailingZeros;

    }
}
