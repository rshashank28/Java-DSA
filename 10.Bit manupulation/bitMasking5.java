//check if k'th bit is set or not

public class bitMasking5{

    public static void main(String[] args) {

        // if k=3 then check 3rd bit is 1 or not 

        //first create mask
        int a=9;// 9 in binary is 1001
        int k=2;
        int mask=1<<k;

        if((a&mask)==0){
            System.out.println("not set");
        }

        else System.out.println("bit set");
    }
}








