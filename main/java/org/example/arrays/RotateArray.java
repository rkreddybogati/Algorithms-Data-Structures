package org.example.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateArray {

    public static void rotateArr()
    {
        //reverse(arr, 0, arr.length-1);
        //reverse(arr, 0, arr.length-d-1);
        //reverse(arr, arr.length-d, arr.length-1);

        int[] arr = {40, 13, 27, 87, 95, 40, 96, 71, 35, 79, 68, 2, 98, 3, 18, 93, 53, 57, 2, 81, 87, 42, 66, 90, 45, 20, 41, 30, 32, 18, 98, 72, 82, 76, 10, 28, 68, 57, 98, 54, 87, 66, 7, 84, 20, 25, 29, 72, 33, 30, 4, 20, 71, 69, 9, 16, 41, 50, 97, 24, 19, 46, 47, 52, 22, 56, 80, 89, 65, 29, 42, 51, 94, 1, 35, 65, 25};
        int d = 69;

        d = arr.length-d;
        arr = reverse(arr, 0, arr.length-1);
        arr = reverse(arr, 0, d-1);
        arr = reverse(arr, d, arr.length-1);

    }

    public static int[] reverse(int nums[], int start, int end) {
        while (start < end) {
            int temporary = nums[start];
            nums[start] = nums[end];
            nums[end] = temporary;
            start++;
            end--;
        }
        return nums;
    }
}
