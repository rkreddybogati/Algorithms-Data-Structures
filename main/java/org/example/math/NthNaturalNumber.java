package org.example.math;

/**
 * Given a positive integer N. You have to find Nth natural number after removing all the numbers containing digit 9.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 8
 * Output:
 * 8
 * Explanation:
 * After removing natural numbers which contains
 * digit 9, first 8 numbers are 1,2,3,4,5,6,7,8
 * and 8th number is 8.
 * Example 2:
 *
 * Input:
 * N = 9
 * Output:
 * 10
 * Explanation:
 * After removing natural numbers which contains
 * digit 9, first 9 numbers are 1,2,3,4,5,6,7,8,10
 * and 9th number is 10.
 */
public class NthNaturalNumber {

    public static void run() {
        int N = 19;
        System.out.println(nthNaturalNumber(N));
    }

    static long nthNaturalNumber(int N){

        long ans = 0;
        long n = N;
        long position = 1;
        while(n>0) {
            ans = ans +position*(n%9);
            position = position*10;
            n = n/9;
        }
        return ans;

    }


}
