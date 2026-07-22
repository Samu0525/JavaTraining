public class thiskeyword {
    int age;
    String name;
    thiskeyword(int a, String n){
        this.age=a;
        this.name=n;
    }
    public void display(){
        System.out.println("age:"+age);
        System.out.println("name"+name);
    }

    public static void main(String[] args){
        thiskeyword t=new thiskeyword(23,"Sam");
        t.display();
    }
}
