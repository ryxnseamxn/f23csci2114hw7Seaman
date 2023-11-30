import java.util.ArrayList;
import java.util.List;
//142913828922
public class Problem {
    public static void main(String[] args){
        int n = 2000000;
        long cumsum = 0; 
        List<Integer> primes = sieve(n);
        for(int i = 0; i < primes.size(); i++){
            cumsum+=primes.get(i);
        }
        System.out.println(cumsum);
    }
    public static List<Integer> sieve(int n){
        boolean[] isPrime = new boolean[n+1];
        for(int i = 2; i < isPrime.length; i++){
            isPrime[i] = true;
        }
        for(int i = 2; i * i < n; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= n; j+=i){
                    isPrime[j] = false; 
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for(int i = 0; i < isPrime.length; i++){
            if(isPrime[i]){
                primes.add(i); 
            }
        }
        return primes;
    }
    /* 
    public static List<Integer> sieve(int n){
        //List<Boolean> isPrime = new ArrayList<>();
        boolean[] isPrime = new boolean[n+2]; 
        for(int i = 0; i <= n; i++){
            isPrime[i] = true;
        }
        for(int i = 2; i * i < n; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= n; j+=i){
                    isPrime[j] = false; 
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for(int i = 2; i < isPrime.length; i++){
            if(isPrime[i]){
                primes.add(i);
            }
        }   
        return primes;
    }
    */
}
