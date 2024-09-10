/*
 You are given an array arr containing n-1 distinct integers. 
 The array consists of integers taken from the range 1 to n, meaning one integer is missing from this sequence. 
 Your task is to find the missing integer.

Input:
An integer array arr of size n-1 where the elements are distinct and taken from the range 1 to n.
Example : arr = [1, 2, 4, 5]

Output:
Return the missing integer from the array.
Example: Missing number: 3

 */


package Day2;
public class MissingNum {

    public long findMissNum(int arr[]){
        long sum = 0;
        long n = arr.length+1;
        long naturalsum = (n*(n+1))/2;

        for (int i : arr) {
            sum += i;
        }
        return naturalsum-sum;
    }
}
