public class Problem {
//31875000
    public static void main(String[] args){
        int a = 0;
        int b = 0; 
        int c = 0;
        for(int i = 1; i < 1000; i++){
            for(int j = 2; j < 1000; j++){
                int kSquared = (i * i) + (j * j);
                int k = (int) Math.sqrt(kSquared); 
                int sum = i + j + k;
                if((i * i)+(j * j)==(1000-i-j) * (1000-i-j)){
                    a = i;
                    b = j;
                    c = k; 
                    break; 
                }
            }
        }
        int product = a * b * c;
        //System.out.printf("A: " + a + " B: " + b + " C: " + c + "\n");
        System.out.println(product);
    }    
}
