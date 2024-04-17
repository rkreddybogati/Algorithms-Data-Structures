package org.example.sorting;

public class CountNumberOfPossibleTriangles {

    //Function to count the number of possible triangles.
    static int findNumberOfTriangles(int arr[], int n)
    {
        // code here
        /*
        Formula for combinations
        n numbers and combination of r numbers is
            n!/(r! (n-r)!);
        */
        int numerator = getFactorial(n);
        int denominator = getFactorial(3) * getFactorial(n-3);
        return  numerator/denominator;
    }

    private static int getFactorial(int num) {

        if(num==0 || num ==1) {
            return 1;
        }

        return num*getFactorial(num-1);
    }

}
