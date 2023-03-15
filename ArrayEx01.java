public class ArrayEx01 {
    public static void main(String[] args) {
        //배열의 선언 arr이라는 integer 형태의 방 만들기
        int[] arr ;

        //배열의 생성 5개의 방을 생성
        arr = new int[5];

        //생성과 선언을 동시에
        int[] arr1 = new int[5];
        
        

        //배열의 초기화
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println(arr[0]);
        System.out.println(arr);//메모리참조값 호출
    }
}
