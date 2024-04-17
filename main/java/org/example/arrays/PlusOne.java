package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {


    public static void run() {
        int n = 3;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(9);
        list.add(9);

        list = increment(list, n);
        System.out.println(list);
    }


    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        int i = N-1;

        int element = 0;
        while(i>=0){
            element = element + arr.get(i);

            if(i==N-1){
                element = element+1;
            }

            if(element==10){
                arr.set(i, 0);
                element = 1;
            } else {
                arr.set(i, element);
                element = 0;
            }
            i--;
        }

        if (element==1) {
            arr.add(0, 1);
        }

        return arr;
    }

}
