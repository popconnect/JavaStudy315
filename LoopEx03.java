public class LoopEx03 {
    public static void main(String[] args) {
        
        //int i = 1;
        /* while(i<=9) {
            System.out.print("--" + i + "단" + "--\n" );
            int j = 1;
            while(j<=9) {
                System.out.printf("%s x %s = %s\t", i, j, (i*j));
                j++;
            }
            i++;
            System.out.println();
        } */

       int i=1;
        do {
            System.out.print("\n--" + i + "단" + "--\n" );
            int j=1;
            do {
                System.out.printf("%s x %s = %s\t", i, j, (i*j));
                j++;
            } while (j<=9);
            i++;
        }while (i<=9);
    }
}
