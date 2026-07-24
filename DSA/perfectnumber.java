package DSA;
import java.util.*;

public class perfectnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
       
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }}
            
        if(sum==num){
            System.out.println("Numbber is perfect");
        }else{
            System.out.println("Not a perfect");
        }
        
    }
}
