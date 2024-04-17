package org.example.interviews;

public class DivideArrayInEqualSums {


    public static void getEqualArrays() {

        int[] arr = { 1 , 2 , 3 , 4 , 5 , 5 , 20};
        int pivote = getPivote(arr);

        System.out.println("pivote: "+pivote);
    }

    private static int getPivote(int[] arr) {


        int i=1;
        int j=arr.length-2;
        int leftSum = arr[0];
        int rightSum = arr[arr.length-1];
        while(i<=j) {
            if(leftSum<rightSum) {
                leftSum = leftSum + arr[i];
                i++;
            } else {
                rightSum = rightSum + arr[j];
                j--;
            }
        }
        return i-1;
    }
}
