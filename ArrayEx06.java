public class ArrayEx06 {
    public static void main(String[] args) {
        int[][][] intArray = 
        {
            {
                {1, 2, 3},
                {10, 20, 30}
            },
            {
                {3, 4, 5},
                {30, 40, 50}
            },
            {
                {6, 7, 8},
                {60, 70, 80}
            }
        };

             for ( int i=0 ; i<intArray.length; i++) {
                for (int j=0; j<intArray[i].length; j++ ) {
                    for (int k=0; k<intArray[i][j].length; k++) {
                        System.out.println(intArray[i][j][k]);
                    }
                }
            } 
            /* for (int[][] i : intArray) {
                for ( int[]j : i) {
                    for ( int[]k : j) {
                        System.out.println(intArray[i];
                    }
                }
            } */
        };
    }

