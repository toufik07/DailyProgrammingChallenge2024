package Day21;
import java.util.*;

public class ReverseStack {
    public static void insert(Stack<Integer> st , int val){
        if(st.size() == 0){
            st.push(val);
            return;
        }
        int temp = st.pop();
        insert(st, val);
        st.push(temp);
    }
    public static void reverseStack(Stack<Integer> st){
        if(st.size() <= 1)
         return;
        int temp = st.pop();
        reverseStack(st);
        insert(st,temp);
    }
}
