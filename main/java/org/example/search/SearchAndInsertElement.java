package org.example.search;

public class SearchAndInsertElement {

    public static void run() {
        int n = 20;
        int[] A = {-26, -14, 3, 6, 8, 11, 13, 21, 27, 29, 53, 54, 57, 58, 60, 65, 74, 75, 90, 92};
        int k = 63;
        System.out.println(searchInsertK(A, n, k));
    }

    static int searchInsertK(int Arr[], int N, int k)
    {
        // code here

        int left=0;
        int right = N-1;

        if(Arr[left]>k){
            return left;
        }
        if(Arr[right]<k){
            return N;
        }

        while(left<right){

            if(Arr[left]==k){
                return left;
            }
            if(Arr[right]==k){
                return right;
            }

            if(Arr[left]>k) {
                return left;
            }

            if(Arr[right]<k){
                return right+1;
            }

            left++;
            right--;
        }

        return left;

    }

}
