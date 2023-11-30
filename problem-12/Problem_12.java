//76576500
public class Problem {
    public static void main(String[] args){
        long i = 1; 
        while(i < Integer.MAX_VALUE){   
            Long n = generateTriangleNumber(i);
            if(findDivisors(n)>=500){
                System.out.println(n);
                break; 
            }
            i++;
        }
    }   
    public static Long generateTriangleNumber(Long n){
        if(n <= 1){
            return n;
        }
        return n + generateTriangleNumber(n-1);
    } 
    public static int findDivisors(Long n){
        int numDivisors=0; 
        for(Long i = (long) 1; i * i<=n; i++){
            if(n%i==0){
                numDivisors++;
                if (i * i != n) {
                    // Count the other divisor
                    numDivisors++;
                }
            }
        }
        return numDivisors;
    }
}
