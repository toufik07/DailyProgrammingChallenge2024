package Day8;
public class Reverse {
    
    public String reverseString(String str){
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        

        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }
            else if(sb.length() > 1){ 
                ans.append(sb.reverse());
                ans.append(' ');
                sb.setLength(0);
            }
        }
        ans.append(sb.reverse());
        
        return ans.toString();
    }
}
