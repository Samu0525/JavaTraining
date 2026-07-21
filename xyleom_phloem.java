public class xyleom_phloem{
    public static void main(String[] args){
        int number=1234;
        String str=String.valueOf(number);
        //int num[]=new int[str.length()];
        int result1=(str.charAt(0)-'0')+(str.charAt(str.length()-1)-'0');
        int result2=0;
        for(int i=1;i<str.length()-1;i++){
           result2 =result2+str.charAt(i)-'0';
        }
        if(result1==result2){
            System.out.println("xylem");
        }else{
            System.out.println("phloem");
        }
    }
}
