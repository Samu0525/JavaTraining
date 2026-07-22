package HAS_A;
import java.util.Scanner;
 class Bag
 {
        String bag_brand;
        double bag_price;
        laptop l;//-> Late binding /aggregation/ association

             Bag( String bag_brand,double bag_price){//constructor
            this.bag_brand=bag_brand;
            this.bag_price=bag_price;
            System.out.println("Bag created");
        }
        public void addLaptop(){
            if(l==null){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter Laptop model name: ");
            String name=sc.next();
            sc.nextLine();
            System.out.println("Enter Laptop  brand: ");
            String brand=sc.next();
            System.out.println("Enter Laptop  price: ");
            double price=sc.nextDouble();
            l=new laptop(name,brand,price);
            System.out.println("Laptop added successfully");
        }else{
            System.out.println("Bag is full");
        }
        }
        public void removeLaptop(){
            if(l==null){
                System.out.println("BAg is Empty.. please add laptop first");
            }else{
                l=null;// nullyfying an object --> data remove
                System.out.println("Laptop removed successfully");
            }
        }
        public void displayBag(){
            System.out.println("--Bag info---");
            System.out.println("Bag Brand name:"+bag_brand);
            System.out.println("Bag price:"+bag_price);

        }
        
    
    public static void main(String[] args){
        Bag b = new Bag("Skybag",4000.0);
        Scanner sc=new Scanner(System.in);
        for(;;){//infinite loop
            System.out.println("Enter ur choice");
            System.out.println("1.AddLaptop 2.RemoveLaptop 3.DisplayLaptop 4.DisplayBag 5.Exit");
            switch(sc.nextInt()){
                case 1:
                    b.addLaptop();
                    break;
                case 2:
                    b.removeLaptop();
                    break;
                case 3:
                    if(b.l!=null)
                    {
                    b.l.displayLaptop();
                    break;
                    }else{
                        System.out.println("bag is empty please add laptop first");
                    }
                    break;
                case 4:
                    b.displayBag();
                    break;
                case 5:
                    System.out.println("Logout success....");
                    System.exit(0);
                    break;

           
           
            }
        } 
    }
 }
            
        
    


    

