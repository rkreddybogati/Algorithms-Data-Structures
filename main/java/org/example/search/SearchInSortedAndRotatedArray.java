package org.example.search;

import java.io.*;

public class SearchInSortedAndRotatedArray {

    public static int search()
    {
        long start = System.currentTimeMillis();

        int result = 0;

        File file = new File(
                "/Users/ramakrishnareddy/Downloads/SearchInSortedAndRotatedArrayFileInput.txt");
        try {
            BufferedReader br
                    = new BufferedReader(new FileReader(file));

            String st;
            // Condition holds true till
            // there is character in a string
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String[] strArr = str.split(" ");
            int[] array = new int[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                array[i] = Integer.parseInt(strArr[i]);
            }
            int target = Integer.parseInt(br.readLine());

            // code here
            int low = 0 ;
            int high = n-1;
            int bitonicPoint = getBitonicPoint(array, low, high);

            if(target>=array[0] && target<=array[bitonicPoint]) {
                low = 0;
                high = bitonicPoint;
            } else {
                low = bitonicPoint;
                high = n-1;
            }

            result = getIndex(array, low, high, target);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // code here
       /* int low = 0 ;
        int[] array = {5,6,7,8,9,10,1,2,3};
        int high = 9;
        int target = 10;
        int bitonicPoint = getBitonicPoint(array, low, high);

        if(target>=array[0] && target<=array[bitonicPoint]) {
            low = 0;
            high = bitonicPoint;
        } else {
            low = bitonicPoint;
            high = 9;
        }

        result = getIndex(array, low, high, target);*/

        long end = System.currentTimeMillis();
        System.out.println("Time lapsed: " + (end-start) );
        System.out.println("Result: " + result );
        return result;
    }


    private static int getIndex(int arr[], int low, int high, int target) {
        int index = -1;
        while(low<=high) {

            if (low==high) {
                break;
            }
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                index = mid;
                break;
            } else if(arr[mid]<target) {
                low = mid+1;
            } else if(target<arr[mid]) {
                high = mid;
            }
        }
        return index;
    }

    private static int getBitonicPoint(int[] arr, int low, int high) {
        int result = getBitonicPoint1(arr, low, high);

        /*
        if(result == arr[high]) {
            low = 0;
            high = high/2;
            int resultTillMid = getBitonicPoint1(arr, low, high);
            if(!(resultTillMid==arr[high])) {
                result = resultTillMid;
            }
        }
        */

        return result;
    }

    private static int getBitonicPoint1(int[] arr, int low, int high) {
        int result = -1;
        while(low<high) {
            int mid = low +((high-low)/2);
            if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1] && arr[low]<arr[mid]) {
                low = mid+1;
                //getBitonicPoint(arr, mid+1, high);
            } else if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1] && arr[low]>arr[mid]) {
                high=mid;
                //getBitonicPoint(arr, low, mid);
            } else if(arr[mid-1]>arr[mid]) {
                result = mid-1;
                break;
                //return mid-1;
            } else if(arr[mid]>arr[mid+1]) {
                result = mid;
                break;
                //return mid;
            }
        }

        if (low==high) {
            result = high;
        }

        return result;
    }


}
