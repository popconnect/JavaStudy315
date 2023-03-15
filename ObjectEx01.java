class Student {
    String Hakbun;
    String name;
    int age;
    double height;
    double weight;
} 

public class ObjectEx01 {
    //Class Student 가 컴파일시 분리됨
    public static void main(String[] args) {
        
        Student stu1 = new Student();

        stu1.Hakbun = "1001";
        stu1.name = "홍길동";
        stu1.age = 22;
        stu1.height = 180.5;
        stu1.weight = 80;

        Student stu2 = new Student();

        stu2.Hakbun = "1002";
        stu2.name = "박문수";
        stu2.age = 20;
        stu2.height = 170;
        stu2.weight = 75;

        System.out.println(stu2);

    }
}
