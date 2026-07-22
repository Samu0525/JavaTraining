public class constructorr{
     constructorr(){
System.out.println("Non parametrized contruuctor");
    }
    constructorr(String name,int age){
        System.out.print("Parametrized constructorr: "+name+" "+age);
    }
    //in java there is no copy constructor because it is method overiding and java main method overiding.

    //constructortor chaining
    
    public static void main(String[] args){
        constructorr c=new constructorr();
        constructorr cc=new constructorr("sam",7);


    }
}   