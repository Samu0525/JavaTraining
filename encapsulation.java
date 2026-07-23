public class encapsulation {
    private int age=23;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args){
        encapsulation t=new encapsulation();
        t.setAge(23);
        System.out.print(t.getAge());
        
    }
}
