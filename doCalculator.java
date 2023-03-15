class Util {
     int doCalculator(String sign, int data1, int data2) {
        int value = 0;

        switch(sign) {
            case "+" :
                value = (data1 + data2);
                break;
            case "-" :
                value = (data1 - data2);
                break;
            case "*" :
                value = (data1 * data2);
                break;
        }
        System.out.println(data1 + " " + sign + " " + data2 + " = " + value);
        return value;
    }
}

public class doCalculator {
    public static void main(String[] args) {

        Util util = new Util();
        util.doCalculator("+", 5, 8);
    }
    

}
