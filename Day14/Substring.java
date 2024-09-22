package Day14;
import java.util.*;;

public class Substring {
    
    public int CountSubStr(String s , int k) {
        return countSubstring(s,k) - countSubstring(s, k-1);
    }

    public int countSubstring(String str,int k){
        HashMap<Character,Integer> mp = new HashMap<>();
        int left = 0;
        int count = 0;

        for(int i=0;i<str.length();i++){
            mp.put(str.charAt(i),mp.getOrDefault(str.charAt(i), 0)+1);

            while(mp.size() > k){
              mp.put(str.charAt(left), mp.getOrDefault(str.charAt(left), 0)-1);
              if(mp.get(str.charAt(left)) == 0){
                mp.remove(str.charAt(left));
              }
              left++;
            }
            count += i-left+1;
        }
        return count;
    } 
}
