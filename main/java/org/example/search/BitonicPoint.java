package org.example.search;

import java.io.*;
import java.util.Scanner;

public class BitonicPoint {

    public int findMaximum() {

        int result = 0;

       /* int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        //reading the number of elements from the that we want to enter
        n=sc.nextInt();
        //creates an array in the memory of length 10
        int[] arr = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
        //reading array elements from the user
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
        // accessing array elements using the for loop
        for (int i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }*/


        File file = new File(
                "/Users/ramakrishnareddy/Downloads/bitonicfileInput.txt");
        try {
            BufferedReader br
                    = new BufferedReader(new FileReader(file));

            String st;
            // Condition holds true till
            // there is character in a string
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String[] strArr = str.split(" ");
            int[] arr = new int[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                arr[i] = Integer.parseInt(strArr[i]);
            }

            int low = 0 ;
            int high = n-1;
            result = getBitonicPoint(arr, low, high);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // code here
        //int low = 0 ;
        //int high = n-1;
        //return getBitonicPoint(arr, low, high);
        return result;

    }

    private int getBitonicPoint(int[] arr, int low, int high) {

        int result = -1;
        while(low<high) {
            int mid = low +((high-low)/2);
            if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1] ) {
                low = mid+1;
                //getBitonicPoint(arr, mid+1, high);
            } else if(arr[mid-1]>arr[mid] && arr[mid]>arr[mid+1]) {
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
            result = arr[high];
        }

        return result;
    }

}
