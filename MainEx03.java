class MethodEx {
    void Dofunc(int a) {
        System.out.println("doFunc(int a) 호출");
    }

    void Dofunc(String s) {
        System.out.println("doFunc(string s) 호출");
    }
    
}

public class MainEx03 {
    public static void main(String[] args) {
        
        MethodEx mex = new MethodEx();

        mex.Dofunc(1);
        mex.Dofunc("get");
        
    }
}
