  //233168
public class Problem {
    public static void main(String[] args){
        int n = 1000; 
        int cumSum = 0;
        for(int i = 0; i < n; i++){
            if(i % 3 == 0 || i % 5 == 0){
                cumSum+=i; 
            }
        }
        System.out.println(cumSum);
    }
}