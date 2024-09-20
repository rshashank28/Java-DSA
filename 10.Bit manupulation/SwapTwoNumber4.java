//swap two numbers

public class SwapTwoNumber4 {
    
    public static void main(String[] args) {
       // by using temp method one
       // by below method two
        int a=6,b=7;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);


        //by using xor 
         a=a^b;
         b=a^b;
         a=a^b;
         System.out.println(a);

         int c=9;
         System.out.println(c^c);

    }
}
