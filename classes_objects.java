public class classes_objects {
    static int a=22;
    int b=8;
    static void m1(){
        System.out.println("sttaic m1");
    }
    void m2(){
        System.out.println("static m2");
    }
    public static void main(String[] args){
        classes_objects co=new classes_objects();
        co.m2();
        System.out.println(co.b);
        m1();
        System.out.println(a);


    }
}
