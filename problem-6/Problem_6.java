//25164150
public class Problem {
    public static void main(String[] args){
        int squaredSums = 0;
        int sumSquares = 0;
        for(int i = 1; i <= 100; i++){
            squaredSums+=i * i;
            sumSquares+=i; 
        }
        sumSquares = sumSquares * sumSquares;
        int difference = sumSquares - squaredSums;
        System.out.println(difference);
    }    
}
