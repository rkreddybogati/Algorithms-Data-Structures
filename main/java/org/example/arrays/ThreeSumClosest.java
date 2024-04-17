package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ThreeSumClosest {

    public static int threeSumClosest()
    {
        int[] arr = {-93269, 35347 ,8154, 90737, 96693, 11879, -7466, -94661, 55782, 8413, -53391, 8562, 90173, 37429, 57710, -58295, 11014, 9676 ,-65918, -43230, 88609, 25677, 49401, 57278, 82311, 85608, -71279, -43090, 29474, -87073, 82007, -84629 ,41470 ,1113, 27503, 78270, 15700, -58726, 9362, -29417, 67139, -804, 67388, 95040, 36769, -26982, 43387, 93898 ,35979, 58621, 24332, 21324, 57665, 85546, 5330, 89646, 87497, 44739, 66433, 79193, 48067, 30772, 80200, 48664, 235 ,18376 ,19282, 50539, 4392, 28384, 47370 ,-23207, 41543, 1000, 86684};
        int target = 86991;

        //return orderofN3(arr, target);
        return orderofN2(arr, target);
    }


    public static int orderofN2(int[] arr, int target){

        int closestSum = Integer.MAX_VALUE;
        Arrays.sort(arr);

        //ArrayList<Integer> list = new ArrayList();

        for (int i=0; i<arr.length-2; i++) {
            int left=i+1;
            int right = arr.length-1;
            while (left<right){

                int total = arr[i] + arr[left] + arr[right];
                if(Math.abs(target-closestSum) >
                                Math.abs(target-total)) {
                    closestSum = total;
                   /* list.add(closestSum);
                    System.out.println(closestSum);*/
                }

                if (total<target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

       /* Collections.sort(list, Comparator.reverseOrder());

        for (Integer result: list){
            if (target>=result){
                return result;
            }
        }

        return list.get(list.size()-1);*/

        return closestSum;

       /* // Sort the array
        Arrays.sort(arr);

        // To store the closest sum
        // Assigning long to avoid overflow condition
        // when array has negative integers
        long closestSum = Integer.MAX_VALUE;

        // Fix the smallest number among
        // the three integers
        for (int i = 0; i < arr.length - 2; i++)
        {

            // Two pointers initially pointing at
            // the last and the element
            // next to the fixed element
            int ptr1 = i + 1, ptr2 = arr.length - 1;

            // While there could be more pairs to check
            while (ptr1 < ptr2)
            {

                // Calculate the sum of the current triplet
                int sum = arr[i] + arr[ptr1] + arr[ptr2];

                // If the sum is more closer than
                // the current closest sum
                if (Math.abs(target - sum) < Math.abs(target - closestSum))
                {
                    closestSum = sum;
                }

                // If sum is greater than x then decrement
                // the second pointer to get a smaller sum
                if (sum > target)
                {
                    ptr2--;
                }

                // Else increment the first pointer
                // to get a larger sum
                else
                {
                    ptr1++;
                }
            }
        }

        // Return the closest sum found
        return (int)closestSum;*/

    }


    public static int orderofN3(int[] arr, int target){
        // To store the closest sum
        int closestSum = Integer.MAX_VALUE;

        // Run three nested loops each loop
        // for each element of triplet
        for(int i = 0; i < arr.length ; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                for(int k = j + 1; k < arr.length; k++)
                {

                    // Update the closestSum
                    if (Math.abs(target - closestSum) >
                            Math.abs(target - (arr[i] + arr[j] + arr[k])))
                        closestSum = (arr[i] + arr[j] + arr[k]);
                }
            }
        }

        // Return the closest sum found
        //return closestSum;
        return closestSum;
    }

}
