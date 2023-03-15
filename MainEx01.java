import javax.naming.spi.DirStateFactory.Result;

class MethodEx {
    //단순한 메소드 선언
    void doFunc1() {    //void = 리턴값이 없음
        System.out.println("Dofuck 호출");;
    }
    void doFunc2(int data1) {
        int data0 = 10;
        System.out.println("Dofunc2 호출 :" + data0);
        System.out.println("Dofunc2 호출 :" + data1);
    }
    void doFunc3(int data1, String data2) {
        int data0 = 10;
        System.out.println("Dofunc2 호출 :" + data2);
        System.out.println("Dofunc2 호출 :" + data1);
    }
    int doFunc4(int data1, int data2) {
        int sum = data1 + data2;
        return sum;
    }
}

public class MainEx01 {
    public static void main(String[] args) {
        //선언
        MethodEx ex = new MethodEx();
        //호출
        ex.doFunc1();
        ex.doFunc2(33);
        ex.doFunc3(3, "abc");
        int result = ex.doFunc4(10, 40);
        System.out.println("result" + result);

        
    }
}
