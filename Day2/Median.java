package Day2;

import java.util.PriorityQueue;

public class Median
{
    public double findMedian(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = arr.length;

        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        int size = (n % 2 == 0)?n/2-1:n/2;
        int flag = 1;

        while(flag <= size){
           pq.poll();
           flag++;
        }  
        return (n % 2 != 0)?pq.peek():(double)(pq.poll()+pq.poll())/2;
    }
}