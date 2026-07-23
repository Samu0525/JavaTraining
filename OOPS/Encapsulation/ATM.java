package OOPS.Encapsulation;

import java.util.Scanner;

public class ATM {
    private int pin;//Global /NS/ Instance var
    public double balance=0.0;

    public void setPin(int pin){
        this.pin=pin;
    }
    public int getPin()//->Gettre Method
    {
        return pin;
    }
    public void deposit(double bal){
        balance=balance+bal;
    }
    public void withdrawal(double bal){
        balance=balance-bal;
    }
    public void displayBalance(){
        System.out.println("Available Balance:"+balance);
    }
    public static void main(String[] args){
        ATM a=new ATM();
        Scanner sc=new Scanner(System.in);

        a.setPin(1234);
        System.out.println("Enter User pin");
        int user_pin=sc.nextInt();
        if(user_pin==a.getPin()){
            System.out.println("Login success...");
            for(;;){
                System.out.println("Enter you choice");
                System.out.println("1.Deposit 2.Withdrawl 3.CheckBalance 4.UpdatePin 5.DisplayPin 6.Exit");
                switch(sc.nextInt()){
                    case 1:
                        System.out.println("Enter amount to deposit:");
                        double amt=sc.nextDouble();
                        a.deposit(amt);
                        System.out.println("Deposit success");
                        break;
                    case 2:
                        System.out.println("Enter amount to withdrawl:");
                        double amtw=sc.nextDouble();
                        if(amtw>a.balance){
                            System.out.println("Insufficient funds...");
                        }else{
                            a.withdrawal(amtw);
                            System.out.println("Withdrawl success!");

                        }break;
                    case 3:
                        a.displayBalance();
                        break;
                    case 4:
                        System.out.println("Enter old pi");
                        int oldPin=sc.nextInt();
                        if(oldPin==a.getPin()){
                            System.out.println("pin matches");
                            System.out.println("Enter new pin:");
                            int newPin=sc.nextInt();
                            a.setPin(newPin);
                            System.out.println("Pin update success");
                        }else{
                            System.out.println("Please enetr old pin again...");
                        }
                        break;
                    case 5:
                        System.out.println("User pin:"+a.getPin());
                        break;
                    case 6:
                        System.out.println("Logout...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println();
                }
            }
        }else{
            System.out.println("Invalid credentials... please try again");
        }
    }
}
