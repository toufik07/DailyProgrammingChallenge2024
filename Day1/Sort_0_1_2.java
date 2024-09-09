/*You are given an array arr consisting only of 0s, 1s, and 2s. The task is to sort the array in increasing order in linear time (i.e., O(n)) without using any extra space. This means you need to rearrange the array in-place.

Input:
An integer array arr of size n where each element is either 0, 1, or 2.
Example : arr = [0, 1, 2, 1, 0, 2, 1, 0]

Output:
The sorted array, arranged in increasing order of 0s, 1s, and 2s.
Example: [0, 0, 0, 1, 1, 1, 2, 2]*/


package Day1;
class Sort_0_1_2 {

    public void sortArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;

        while(mid <= end){
            switch (arr[mid]) {
                case 0:
                    int temp = arr[start];
                    arr[start] = arr[mid];
                    arr[mid] = temp;
                    start++;
                    mid++;
                    break;
                
                case 1:
                    mid++;
                    break;
                
                case 2:
                    temp = arr[end];
                    arr[end] = arr[mid];
                    arr[mid] = temp;
                    end--;
                    break; 
            
                default:
                    break;
            }
        }
    }
}