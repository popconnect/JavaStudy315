public class ArrayEx04 {
    public static void main(String[] args) {
        int[][] arr1 ;
        // 3행 2열
        arr1 = new int[3][2];

        arr1[0][0] = 10;
        arr1[0][1] = 20;
        arr1[1][0] = 30;
        arr1[1][1] = 40;
        arr1[2][0] = 50;
        arr1[2][1] = 60;


        /** 2차원배열에 대한 구조는 arr1의 주소 -> 
            arr1의 1차행에 대한 방 -> 행에 대한 열의 방  */
        int[][] arr2 = new int[][] {{10, 20}, {30, 40}, {50, 60}};
        int[][] arr3 = {{10, 20}, {30, 40}, {50, 60}};


        /* System.out.println(arr3[0][0]);
        System.out.println(arr3[2][1]); */

        /* System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[0][0]);
        System.out.println(arr1.length); // 행개수 출력
        System.out.println(arr1[0].length); // 열개수 출력 */

         for(int i=0 ; i<arr1.length; i++) {
            for(int j=0; j<arr1[i].length; j++) {
                /* System.out.println(arr1[i][j]); */
            }
        } 

        for(int[] cols : arr1) {
            for(int data : cols) {
                System.out.println(data);
            }
        }
    }
}
