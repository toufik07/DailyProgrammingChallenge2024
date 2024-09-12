package Day4;

import java.util.Arrays;

public class MergeSort {
    public void mergesort(int arr1[],int arr2[]){
        int first = 0;
        int last = arr1.length-1;

        while(first < arr2.length && last >= 0){
            if(arr1[last] > arr2[first]){
                int temp = arr1[last];
                arr1[last]= arr2[first];
                arr2[first] = temp;
                last--;
            }
            else{
              first++;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
