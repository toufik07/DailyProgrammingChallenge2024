package Day17;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> primeFactors(int N) {
        List<Integer> factors = new ArrayList<>();
        
        while (N % 2 == 0) {
            factors.add(2);
            N /= 2;
        }
        
        for (int i = 3; i <= Math.sqrt(N); i += 2) {
            while (N % i == 0) {
                factors.add(i);
                N /= i;
            }
        }
        
        if (N > 2) {
            factors.add(N);
        }
        
        return factors;
    }
}
