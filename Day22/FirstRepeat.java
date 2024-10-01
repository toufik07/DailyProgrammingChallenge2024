
package Day22;

import java.util.HashMap;

public class FirstRepeat {

    public static int findRepeat(int arr[],int k){
        HashMap<Integer,Integer> mp = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
        }

        for(int i=0;i<arr.length;i++){
            if(mp.get(arr[i]) == k)
              return i;
        }

        return -1;
    }
    public static void main(String[] args) {
       int arr[] = {3, 1, 4, 4, 5, 2, 6, 1, 4};
       int index = findRepeat(arr,2);
       System.out.println(index);
    }
}