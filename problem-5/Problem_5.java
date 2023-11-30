import java.util.ArrayList;
//232792560
public class Problem{
    public static void main(String[] args){
        int num = 1; // Start with 1 since we're looking for the smallest number
        while (!checkMod(num)) {
            num++;
        }
        System.out.println(num);
    }
    public static boolean checkMod(int i){
        int j = 1; 
        while(j<=20){
            if(i%j!=0){
                return false;
            }
            j++;
        }
        return true; 
    }
    public static int factorial(int n){
        if(n <= 1){
            return 1; 
        }
        return (n * factorial(n-1));  
    }
}