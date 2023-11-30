import java.util.ArrayList;
//4613732

public class Problem {
    public static void main(String[] args){
        int cumSum = 0; 
        int n = 0; 
        while(fibonacci(n)<4000000){
            if(fibonacci(n)%2==0){
                cumSum+=fibonacci(n);
            }
            n++;
        }
        System.out.println(cumSum);
    }
    public static int fibonacci(int n){
        if(n<=0){
            return 0;
        }else if(n==1){
            return 1; 
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

}
