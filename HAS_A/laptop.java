package HAS_A;

public class laptop {
            String laptop_name;
        String laptop_brand;
        double laptop_price;
        laptop(String laptop_name,String laptop_brand,double laptop_price){
            this.laptop_name=laptop_name;
            this.laptop_brand=laptop_brand;
            this.laptop_price=laptop_price;
        }
        public void displayLaptop(){
            System.out.println("Laptop Information");
            System.out.println(laptop_name);
            System.out.println(laptop_brand);
            System.out.println(laptop_price);

        }
}
