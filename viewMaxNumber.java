class Util {
    int getData(int data1, int data2, int data3) {
        int max;
        if(data1 > data2 && data1 > data3) {
            max = data1;
        } else if (data2 > data1 && data2 > data3){
            max = data2;
        } else {
            max = data3;
        }
        return max;
    }
}

public class viewMaxNumber {
    public static void main(String[] args) {

        Util util = new Util();

        int result = util.getData(3, 5, 7);
        System.out.println(result);
    }
}
