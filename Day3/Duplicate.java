/*
 You are given an array arr containing n+1 integers, where each integer is in the range [1, n] inclusive.
  There is exactly one duplicate number in the array, but it may appear more than once. 
  Your task is to find the duplicate number without modifying the array and using constant extra space.

Input:
An integer array arr of size n+1, where each element is an integer in the range [1, n].
Example : arr = [3, 1, 3, 4, 2]

Output:
Return the duplicate integer present in the array.
Example: Duplicate number: 3

*/


package Day3; 
public class Duplicate {
    public int findDuplicate(int arr[]){
        int slow = arr[0];
        int fast = arr[0];

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);
        slow = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}
 