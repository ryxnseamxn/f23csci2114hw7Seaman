import java.util.ArrayList;
import java.util.List;
//104743
public class Problem {
    public static void main(String[] args){
        List<Integer> primes = sieve(10000000);
        System.out.println(primes.get(10000));
    }    
    public static List<Integer> sieve(int n){
        //List<Boolean> isPrime = new ArrayList<>();
        boolean[] isPrime = new boolean[n+1]; 
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
}
