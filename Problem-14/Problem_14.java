import java.util.HashMap;
//837799
public class Problem {
    public static void main(String[] args){
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        //System.out.println(findLength(13));

        for(int i = 1; i <= 1000000; i++){
            map.put(findLength(i), i);
        }
        //System.out.println("Done adding");
        for(int key : map.keySet()){
            max = (key>max)? key: max; 
        }
        System.out.println(map.get(max));
    }
    public static int findLength(long n){
        int length = 1; 
        while(n!=1){
            if(n%2!=0){
                n = (3 * n) + 1;
            }else{
                n = n/2;     
            }
            length++; 
        }
        return length; 
    }
}
