public class LoopEx02 {
    public static void main(String[] args) {
        
        
        for(int i=1 ; i<=9 ; i++){
            for(int j=1 ; j<=9 ; j++){
                //System.out.printf( i + "x" + j + "=" + i*j + "\t");
                System.out.printf("%s * %s = %s", i, j, (i*j));
            }
            System.out.println("");
        }
    }
}

