public class method_overloading {
    public static void m1(int a){
        System.out.println(a);
    }
    public static void m1(String b){
        System.out.println(b);
    }
    public static void main(String[] args ){
        method_overloading m= new method_overloading();
        m.m1(3);
    }
}
