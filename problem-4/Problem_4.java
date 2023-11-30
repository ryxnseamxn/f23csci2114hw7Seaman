import java.util.ArrayList;
//906609
public class Solution{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i <= 999; i++){
            for(int j = 0; j <= 999 ; j++){
                int product = i * j; 
                if(checkPalindrome(product)){
                    list.add(product); 
                }
            }
        }
        list.sort(null);
        System.out.println(list.get(list.size()-1));
        
        
    }
    public static boolean checkPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}