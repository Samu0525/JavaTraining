package DSA;
import java.util.*;
public class spynumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int product=1;
        
        while(num>0){
            int rem=num%10;
            sum+=rem;
            product*=rem;
             num=num/10;
        }
        if(sum==product){
            System.out.println("Its is a spy number");
        }else{
            System.out.println("It is not a spy number");
        }
    }
}
