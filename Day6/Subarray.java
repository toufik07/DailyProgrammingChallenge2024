/*
 Find All Subarrays with Zero Sum

You are given an integer array arr of size n. Your task is to find all the subarrays whose elements sum up to zero. A subarray is defined as a contiguous part of the array, and you must return the starting and ending indices of each subarray.

Input:
An integer array arr of size n where n represents the number of elements in the array.
Example : 
Input: [1, 2, -3, 3, -1, 2]

Output:
Return a list of tuples, where each tuple contains two integers. The starting index (0-based) of the subarray. The ending index (0-based) of the subarray.
The output should list all subarrays that sum to zero. If no such subarrays are found, return an empty list.
Example
Output: [(0, 2), (2, 3)]

 */

package Day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Pair{
    public int first;
    public int second;

    Pair(int first,int second){
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString(){
        return "("+this.first+", "+this.second+")";
    }
}
public class Subarray {

    public List<Pair> subarraysum(int arr[]){
        List<Pair> l1 = new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> mp = new HashMap<>();
        mp.put(0,new ArrayList<>());
        mp.get(0).add(-1);
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(mp.containsKey(sum)){
                for (int startindex : mp.get(sum)) {
                    l1.add(new Pair(startindex+1, i));
                }
            }
            mp.putIfAbsent(sum,new ArrayList<>());
            mp.get(sum).add(i);
        }
        return l1;
    }
}
