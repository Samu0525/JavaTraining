public class static_context{
// {   Static context: create data members and methods using static modifier
//     types: 
//     1. Static variable : prefix wiith static modifier
//     2.Static method: prefix with static modifier
//     3.Static block: prefix with static modifier.
//     Note: When we create static context data is stord in stack memory.
//      accessed directly or wuth class name.

        //1. Static variable : prefix wiith static modifier
        static int age=12;

        //2.Static method: prefix with static modifier
        public static void m1(){
            System.out.print("Static method");
        }
        //3.Static block: prefix with static modifier.->>gets called automatically when main method i called
        static{
            System.out.println("Static block");
        }
    
    public static void main(String[]args){
        System.out.println(age);
        m1();
    }
}

