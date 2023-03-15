class MethodEx {
        void DoFunc(int ... args) {
            System.out.println("doFunc1() 호출");
            System.out.println(args.length);
            for (int i=0; i<args.length; i++) {
                System.out.println(args[i]);
            }

        }
    }
public class MainEx05 {
    public static void main(String[] args) {
        MethodEx ex = new MethodEx();

        ex.DoFunc(10, 20);
        ex.DoFunc(10, 20, 30, 40);
    }
}
