package Day18;
public class CountFactors {
    public static int countfactors(int n){
        int count = 0;

        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
               if(n/i != i){
                count += 2;
               }else{
                count++;
               }
            }
        }

        return count;
    }

    public static void main(String [] args){
        int result = countfactors(997);
        System.out.println(result);
    }
}
