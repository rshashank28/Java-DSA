package prefixSum;

public class Leetcode1480 {
    public static void main(String[] args) {
           int []a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0) a[i]=nums[i];
          else  a[i]=nums[i]+a[i-1];
        }
        return a;

       // without use of extra space
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }

        return nums;
    }

}
