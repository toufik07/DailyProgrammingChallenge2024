package Day13;

public class StringPalindrome {
    public String longestPalindrome(String s) {
        int maxLen = 1;
        if(s.length() <= 1)
            return s;
        
        String maxStr = s.substring(0,1);
        
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(j-i+1 > maxLen && isPalindrome(s.substring(i,j+1)) ){
                    maxLen = j-i+1;
                    maxStr = s.substring(i,j+1);
                }
            }
        }
        return maxStr;
    }
    
    public boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        
        while(start < end){
            if(str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        
        return true;
    }
}
