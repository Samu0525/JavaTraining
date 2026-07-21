public class Nonstatic_context {
    // Non static context: without using static modifier
    // 1.Non static variable: create a variable donot prefix with static modifier.
    // 2.Non static method
    // 3.Non static block

    // Note: when we have non static context, data will load inside an object(heap memory)
    // key point: when we have t call non static data then object creation is mandatory.

    int age=22;//-->NS variable or global variable or instance variable or data member
    public void m1(){
        System.out.println("Non static methosd");
    }
    {
        System.out.println("Non static block");
    }

    public static void main(String[] args){
        Nonstatic_context nc=new Nonstatic_context();
        System.out.println("age: "+nc.age);
        nc.m1();
    }
}
