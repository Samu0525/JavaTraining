public  class strong_number {
    public static void A(int num){
        int original=num;
       
        int sum=0;
        while(num>0){
             int fact=1;
            int rem=num%10;
            for(int i=1;i<=rem;i++){
                
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;
        }
        if(sum==original){
            System.out.println("yes strong number");
        }else{
            System.out.println("Nope");
        }

    }
    public static void main(String[] args){
         int num=123;
        strong_number s=new strong_number();
        A(num);
        s.A(num);//run hogi static hoke bhi pr warning aayegi

    }
}
