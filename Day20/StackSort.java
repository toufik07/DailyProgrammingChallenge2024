package Day20;
import java.util.*;
public class StackSort {
    public static void insertVal(Stack<Integer> st , int val){
      if(st.size() == 0 || st.peek() <= val){
        st.push(val);
        return;
      }
      int temp = st.pop();
      insertVal(st, val);
      st.push(temp);
    }
   public static void sortStack(Stack<Integer> st){
      if(st.size() <= 1 )
        return;
      
      int temp = st.peek();
      st.pop();
      sortStack(st);
      insertVal(st,temp);
   }
}
