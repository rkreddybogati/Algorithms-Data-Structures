package org.example.search;

public class LeftMostAndRightMost {

    static class pair  {
        long first, second;
        public pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    public pair indexes()
    {

        long v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        long x=5;

        pair p = new pair(Long.MAX_VALUE, Long.MIN_VALUE);
        boolean[] visited = new boolean[v.length];
        long low = 0;
        long high = v.length-1;
        p = binarySearch(v, x, low, high, visited, p);
        return p;
    }
    private pair binarySearch(long a[], long key, long low, long high, boolean visited[], pair obj) {

        if(high >= low) {
            int middle = (int)(low + ((high-low)/2));
            // found key, and not visited before
            if(a[middle] == key && !visited[middle]) {
                // update if less value you get, for left pair
                if(middle < obj.first)
                    obj.first = middle;

                // update if right value you get, for right pair
                if(middle > obj.second)
                    obj.second = middle;

                // mark the index
                visited[middle] = true;

                // keep on doing this, until you get an item which is not your "key"
                pair flag = binarySearch(a, key, low, middle-1, visited, obj);

                if(flag != null)
                    flag = binarySearch(a, key, middle+1, high, visited, obj);
            }
            // apply regular binary search algo for the rest of the item.
            else if(a[middle] > key) {
                return binarySearch(a, key, low, middle-1, visited, obj);
            } else {
                return binarySearch(a, key, middle+1, high, visited, obj);
            }
        }

        return obj;

        /*
        if(low<=high) {
            int mid = (int)(low+(high-low)/2);
            if(v[mid]==x && !visited[mid]) {
                if(mid<p.first) {
                    p.first=mid;
                }
                if(mid>p.second){
                    p.second=mid;
                }
                visited[mid]=true;
                pair flag = binarySearch(v, low, mid-1, x, visited, p);
                if(flag!=null)
                    flag = binarySearch(v, mid+1, high, x, visited, p);
            } else if(v[mid]<x) {
                binarySearch(v, low, mid, x, visited, p);
            } else {
                binarySearch(v, mid+1, high, x, visited, p);
            }
        }
        return p;
        */

    }


}
