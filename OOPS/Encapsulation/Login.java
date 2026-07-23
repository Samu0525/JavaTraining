package OOPS.Encapsulation;
import java.util.Scanner;
public class Login {
private int id;
String passwd;
public  void setid(int id){
    this.id=id;
    
}
public  void setpasswd(String passwd){
    this.passwd=passwd;
    
}

public int getid(){
    return id;
}   
public String getpasswd(){
    return passwd;
}    
public static void main(String[] args){
Login l=new Login();
Scanner sc=new Scanner(System.in);
l.setid(123);

l.setpasswd("SAM@123");

// if(re.equals(l.getpasswd()) && (res==l.getid()) ){
//     System.out.println("Strings are equal");
// }else{
//     System.out.println("Not equal");
// }


    System.out.println("Enter userid: ");
    int user_id=sc.nextInt();
    if(user_id==l.getid()){
        System.out.println("User id matched...");
        
        System.out.println("Enter user password:");
        String user_passwd=sc.next().toLowerCase();
        if(user_passwd.toString().contains(l.getpasswd().toLowerCase())){
            System.out.println("Password pamatched...");
            System.out.println("Login successful...");
            
        }else{
            System.out.println("Invalid passwaord");
        }

    }else{
        System.out.println("Invalid userid..please enter valid id");
    }
}
 
}
    
