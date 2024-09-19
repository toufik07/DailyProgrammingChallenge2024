
package Day11;

class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        HashSet<String> set = new HashSet<>();
        
        
        StringBuilder sb = new StringBuilder(S);
        
        sol(sb, set, 0);
        
        List<String> result = new ArrayList<>(set);
        
        Collections.sort(result);
        return result;
    }
    
    public void sol(StringBuilder sb, HashSet<String> set, int index){
        if(index == sb.length()){
            set.add(sb.toString());
            return;
        }
        
        for(int i=index;i<sb.length();i++){
            swap(sb, index, i);
            sol(sb, set, index+1);
            swap(sb, index, i);
        }
    }
    
    void swap(StringBuilder sb, int x, int y){
        char ch1 = sb.charAt(x);
        char ch2 = sb.charAt(y);
        
        sb.setCharAt(x, ch2);
        sb.setCharAt(y, ch1);
    }
}