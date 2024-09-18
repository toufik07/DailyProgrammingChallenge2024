package Day10;
import java.util.*;
public class AnagramsGroup {
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> result = new ArrayList<>();
            HashMap<String,List<String>> mp = new HashMap<>();
            
            for(int i=0;i<strs.length;i++){
                char arr[] = strs[i].toCharArray();
                Arrays.sort(arr);
                String word = new String(arr);
                
                if(mp.containsKey(word)){
                    List<String> l1 = mp.get(word);
                    l1.add(strs[i]);
                    mp.put(word,l1);
                }
                else{
                    List<String> l1 = new ArrayList<>();
                    l1.add(strs[i]);
                    mp.put(word,l1);
                }
                
            }
            
            for(Map.Entry<String,List<String>> entry : mp.entrySet()){
                result.add(entry.getValue());
            }
            
            return result;
        }   
}
