package Day15;
import java.util.*;;
public class LongestSubStr {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        
        for(int i=0;i<s.length();i++){
            if(!st.contains(s.charAt(i))){
                maxLength = Math.max(maxLength,i-left+1);
                st.add(s.charAt(i));
            }
            else{
                while(st.contains(s.charAt(i))){
                    st.remove(s.charAt(left));
                    left++;
                }
                st.add(s.charAt(i));
            }
        }
        
        return maxLength;
    }
}