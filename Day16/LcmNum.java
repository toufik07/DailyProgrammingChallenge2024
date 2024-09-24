package Day16;

public class LcmNum {
    public int gcd(int a,int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public long lcmOfNum(int a,int b){
        return ((long)(a/gcd(a,b))*b);
    }
}
