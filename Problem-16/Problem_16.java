import java.math.BigInteger;
import java.util.Stack;
//1366
public class Problem {
    public static void main(String[] args){
        Stack<Integer> nums = new Stack<>();
        BigInteger num = BigInteger.valueOf(2).pow(1000); 
        System.out.println(num);
        for(int i = 0; i < num.toString().length(); i++){
            nums.push(Integer.parseInt(Character.toString(num.toString().charAt(i))));
        }
        long cumsum = 0; 
        while(!nums.isEmpty()){
            cumsum+=nums.pop();
        }
        System.out.println("Sum: " + cumsum);
    }    
}
