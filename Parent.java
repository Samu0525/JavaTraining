
//He super() call statemment aahe n ki super() keyword
class Parent{

Parent(){

super();
System.out.println("This is the constructor of Parent class.");
}
}

class Child extends Parent {

public void childMethod() {
    System.out.println("This is the method of Child class.");

}

public static void main(String[] args) {
    Child c = new Child();
    c.childMethod();
}
}


