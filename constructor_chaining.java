public class constructor_chaining {
    constructor_chaining(String name){
        System.out.println(name);
        System.out.println("constructor1");
    }
    constructor_chaining(int age){
        this("Samruddhi");// see here constructor chaining happenung why beacuse we are calling another constructor parameter with help of this keyword.this() humare class ke andhar string vale constructor ko search karta hain aur uss constructor ke andhar ka sara print karta hain. Isko priority bhi rehti hain hamesha upar chahiye SOP() ke.
        System.out.println("your age is:"+age);
    }

    public static void main(String[] args){
        constructor_chaining c=new constructor_chaining(7);
    }

}
