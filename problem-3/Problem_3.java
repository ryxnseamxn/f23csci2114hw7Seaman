import java.util.ArrayList;
import java.util.Stack;
//6857
public class Problem {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>(); 
        long n = 600851475143L; 
        boolean[] primeGen = generatePrimes((int)Math.floor(Math.sqrt(n)));
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i = 0; i < primeGen.length;i++){
            if (primeGen[i]){
                primes.add(i); 
            }
        }
        int j = 0; 
        long largestPrimeFactor = primes.get(j);
        while(n>1){
            if(n%largestPrimeFactor==0){
                stack.push((int)largestPrimeFactor);
                n/=largestPrimeFactor;
            } else{
                largestPrimeFactor = primes.get(j);
                j++;  
            }
        }
        System.out.println(stack.peek());
    }

    public static boolean[] generatePrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}



