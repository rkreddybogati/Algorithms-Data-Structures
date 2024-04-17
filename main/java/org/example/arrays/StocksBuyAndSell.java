package org.example.arrays;

import java.util.ArrayList;

public class StocksBuyAndSell {

    //Function to find the days of buying and selling stock for max profit.
    public static ArrayList<ArrayList<Integer>> stockBuySell() {

        /*int A[] = {822, 754, 1689, 305, 214, 782, 1463,1432, 1382, 1734, 948, 231, 210, 1676, 877, 670, 1384, 725, 1370, 412, 724, 371, 928, 358, 533, 1031, 850, 1555, 1064, 845, 1692, 514, 630, 1333, 1640, 315, 1639, 1792, 1779, 1325, 1619, 1400, 378, 145, 913, 901, 1652, 530, 1259, 880, 303, 685, 1586};
        int n = 53;

        //int A[] = {4, 2, 2, 2, 4};
        //int n = 5;
        // code here

        ArrayList<ArrayList<Integer>> ll = new ArrayList();

        int i=0;
        int start = -1;
        int end  = -1;

        while(i<n-1) {

            if(A[i]<A[i+1] && start == -1) {
                start = i;
            }

            if (A[i+1] < A[i] ) {
                end = i;
                ArrayList<Integer> list = new ArrayList<>();
                list.add(start);
                list.add(end);
                ll.add(list);
                start = -1;
            }

            i++;
        }

        if (start >=0) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(start);
            list.add(n-1);
            ll.add(list);
        }

        return ll;*/



        //int A[] = {4, 2, 2, 2, 4};
        //int n = 5;

        int A[] = {4, 3, 2, 1};
        int n = 4;

        //int A[] = {100, 180, 260, 310, 40, 515, 656};
        //int n = 7;

        ArrayList<ArrayList<Integer>> sequenceList = new ArrayList();
        if ((n==1) ||(n==2 & A[1]<A[0])){
           return sequenceList;
        }

        if (n==2 & A[1]>A[0]){
            ArrayList<Integer> list = new ArrayList();
            list.add(0);
            list.add(1);
            sequenceList.add(list);
        }

        int[][] seqArr = new int[n-1][2];
        ArrayList<ArrayList<Integer>> seqList = new ArrayList<>();
        int i=0;
        int j = 0;
        while(i<n-1) {

            if(A[i+1] > A[i]) {

                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(i+1);
                seqList.add(list);

                seqArr[j][0] = i;
                seqArr[j][1] = i+1;
            }
            i++;
            j++;
        }

        if (seqList.size()==0){
            return sequenceList;
        }

        if (seqList.size()==1){
            return seqList;
        }

        int startIndex = seqList.get(0).get(0);
        for(int k=0; k<seqList.size()-1; k++) {
            if(seqList.get(k).get(1) == seqList.get(k+1).get(0)){
                continue;
            }

            if( seqList.get(k).get(1) != seqList.get(k+1).get(0) ){
                ArrayList<Integer> list = new ArrayList();
                list.add(startIndex);
                list.add(seqList.get(k).get(1));
                sequenceList.add(list);
                startIndex = seqList.get(k+1).get(0);
            }

        }
        ArrayList<Integer> last = new ArrayList<>();
        last.add(startIndex);
        last.add(seqList.get(seqList.size()-1).get(1));
        sequenceList.add(last);

        return sequenceList;

    }
}
