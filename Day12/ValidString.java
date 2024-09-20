package Day12;

import java.util.Stack;

public class ValidString {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(st.size() > 0 && (st.peek() == '(' && s.charAt(i) == ')')){
                st.pop();
            }
            else if(st.size() > 0 && (st.peek() == '[' && s.charAt(i) == ']')){
                st.pop();
            }
            else if(st.size() > 0 && (st.peek() == '{' && s.charAt(i) == '}')){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        if(st.size() == 0)
             return true;
        else
           return false;
    }
}
