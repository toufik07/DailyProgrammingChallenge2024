/*
 You are given an integer array arr of size n. An element is considered a leader if it is greater than all the elements to its right. Your task is to find all such leader elements in the array.

Input:
An integer array arr of size n.
Example : 
arr = [16, 17, 4, 3, 5, 2]

Output:
Return an array containing all the leader elements in the order in which they appear in the original array.
Example:
Leaders: [17, 5, 2]

 */
package Day5;

import java.util.ArrayList;
import java.util.Collections;

public class Leader {
    public ArrayList<Integer> findLeader(int arr[]){
        ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;
        int max = arr[n-1];

        al.add(max);

        for(int i=n-2;i>=0;i--){
           if(arr[i] > max){
            max = arr[i];
            al.add(max);
           }
        }
        Collections.reverse(al);
        return al;
    }
}
