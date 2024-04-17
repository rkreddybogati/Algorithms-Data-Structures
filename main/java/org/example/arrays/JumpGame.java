package org.example.arrays;

public class JumpGame {

    public static int canReach() {

        int N=13;
        int[] arr = {5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0, 0};

        int i = 0;
        for (int reach = 0; i < arr.length && i <= reach; ++i)
            reach = Math.max(reach, i + arr[i]);

        return (i == arr.length) ? 1 : 0;

    }

}
