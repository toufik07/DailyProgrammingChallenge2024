package Day9;

public class LongestPrefix {

    public String common(String str1,String str2){
        int min = Math.min(str1.length(),str2.length());
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<min;i++){
            if(str1.charAt(i) == str2.charAt(i)){
                sb.append(str1.charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
    public String prefixLong(String[] str){
        if(str == null || str.length == 0)
         return "";
        String result = str[0];

        for(int i=1;i<str.length;i++){
            result = common(result,str[i]);

            if(result.isEmpty()){
                break;
            }
        }
        return result;
    }
}
